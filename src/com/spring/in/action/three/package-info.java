/**
 * @author 		zhanghu1
 * @date   		2015年8月8日
 * @fileName	package-info.java
 * @packageName	com.spring.in.action.three
 * @projectName SpringStudy
 * @Company		Xiaomi
 */
/**
 * @author Administrator
 *
 */
package com.spring.in.action.three;

/**
 * 自动装配Bean的属性，可以不需要写property之类的xml属性，那么，它有四种
 * 实现自动装配的方式：
 * 1.byName类型
 * 		它要求了属性的名字必须要和xml文件中的一个Bean的id相同，其实现自动装配的同时也是
 * 		一种限制
 * 2.byType类型
 * 		它的工作方式与byName是类似的，只不过不再是匹配属性的名字，而是匹配属性的类型，
 * 		即寻找一个Bean的类型与属性的类型相同实现自动装配，但是，如果有多个Bean的类型
 * 		满足条件，那么Spring会抛出异常，这时需要依靠Bean的primary属性来标注Bean的首选
 * 3.constructor自动装配
 * 		当我们在使用构造函数完成装配的时候，可以利用这个标签完成自动装配，而不用去写
 * 		<constructor-arg>，但是它的限制会更大，因为不能存在多个可以匹配的构造器，也不能
 * 		存在多个可以匹配的Bean（同类型）
 * 4.最佳自动装配
 * 		让Spring自动的选择使用哪种自动装配的方式，它会默认首先选择构造器自动装配，如果不
 * 		成功，那么会选择byType类型的自动装配，实际使用中几乎不会利用吧，因为猜测不会多好，
 * 		我个人估计
 * 
 * 使用注解装配Bean的属性
 * 		首先需要说明的是Spring容器默认禁用基于注解的装配，我们需要配置
 * 		<context:annotation-config/>开启这一功能，注意同时需要添加三条命名空间
 * 		一旦配置完成，我们就可以对代码添加注解，标识Spring应该为属性、方法和构造器进行自动
 * 		装配
 * 			one.@Autowired注解的使用
 * 				这个注解非常重要，也非常好用，它可以标注任意的方法，只要是那个方法需要注入那样
 * 				一个Bean属性，即使是构造函数也可以标注，同时，我们也没有必要再去写setter方法了，
 * 				因为这个标注可以直接写在定义对象的地方，即使是private类型也没有问题，这个注解的
 * 				限制就是当多个Bean可以注入的时候，会抛出异常（注：这个注解利用的是byType的方式
 * 				实现注入的）
 * 				注：@Autowired 属性是强契约的，其所标准的属性或者参数必须是可以装配的。
 * 					解决@Autowired注解失败（两种失败）的办法：
 * 						可选的自动装配：
 * 							当自动装配找不到合适的Bean（即没有找到类型匹配的Bean）时，会抛出Bean
 * 							未定义的异常，如果我们不想那么早抛出异常，可以使用这样的方式“破坏”
 * 							Spring的契约，利用@Autowired(requried=false)来设定不一定需要，当Spring
 * 							尝试去装配时，如果失败，那么会设置那个属性或者参数为null
 * 						限定歧义性的依赖：
 * 							这个问题是：当有多个Bean符合装配条件时（即类型相同），那么，也会抛出异常，
 * 							这里的解决办法是明确指定哪一个Bean来自动装配，使用@Qualifier("BeanId")
 * 				创建自定义的限定器，参考MyAnnotation，注意，首先是需要在配置文件中声明这个Bean的，同时
 * 				可以定义多个注解用来多重标记
 * 			two.@Inject注解
 * 				这个注解是java标准实现的，而不是Spring框架的，它的使用方法与@Autowired类似，同样也
 * 				可以自己创建自定义的注解
 * 			之前说的Bean的装配都是自动装配其他Bean的引用，其实，利用@Value("...")
 * 自动检测Bean
 * 		这里对Bean做了更进一步的体验，即可以不用在xml文件中声明bean（id，class等等）了
 * 		那么这里我们需要使用另外一种标签：<context：component-sacn>（注意引入命名空间）
 * 		为了自动检测Bean，需要使用到特殊的注解来标识：
 * 		1.@Component 是一种通用的构造型注解，标识该类为Spring的组件，也是默认的扫描注解，使用方法
 * 		可以查看Guitar.java和__Instrumentalist.java文件
 * 		我们可以自己定义需要过滤的组件，具体的查看书的79页和80页
 * 		2.其他的特殊注解标签还没有涉及，这里暂时不去学习
 * */
