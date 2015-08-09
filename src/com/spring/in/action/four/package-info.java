/**
 * @author 		zhanghu1
 * @date   		2015年8月8日
 * @fileName	package-info.java
 * @packageName	com.spring.in.action.four
 * @projectName SpringStudy
 * @Company		Xiaomi
 */
/**
 * @author Administrator
 *
 */
package com.spring.in.action.four;
/**
 * 面向切面的编程，指的是把公共实现的业务放在切面中，让切面织入到目标对象中。
 * Spring对AOP的支持局限于方法拦截，即在一个或者多个方法的前后切入些业务
 * 切面是由包裹了目标对象（实际要执行的）的代理类实现的，直到应用需要被代理的
 * Bean时，Spring才创建代理对象，所以可以说Spring AOP是基于代理的
 * aopalliance is no longer bundled in Spring..it was completely removed from spring-aop.jar
 * 
 * 我们在xml文件中声明了一个切面，首先，我们需要指明切面是哪个java文件，接着需要做的是声明切点
 * 然后定义在切点执行前后，异常了之后执行的切面通知，这些通知就是在切面java文件中定义的方法
 * 
 * 还可以声明环绕通知，即在一个方法中定义了所有的切面通知，通过执行一些方法把执行控制权转交给被
 * 通知的方法，就像是通知环绕在需要切面的方法一样，所以称为环绕通知
 * 
 * 在xml文件中定义切点的时候，例如这样声明一个切点：
 * <aop:pointcut expression="execution(* com.spring.in.action.four.Performer.performer(..))" 
 *						id="performance"/>
 * 可以看到，我们并不需要关心切点（被通知的方法）的返回值（利用星号代替），也不用关心切点的参数类型
 * 和参数的个数（因为这里我们不需要传递参数）
 * 当需要为通知传递参数时，即把被通知方法的参数传递给通知方法，切点的写法就变成了这样：
 * execution(* com.spring.in.action.four.Volunteer.thinkOfSomething(String))
 *									and args(thoughts)" 
 * 我们需要标注被通知方法的参数，类型和参数名，并将它传递到通知方法中
 * 
 * AspectJ5引入了一种新的方法创建切面，利用注解，非常的简洁
 * 我们只需要在切面这个java文件上面标注@Aspect就可以将其声明为一个切面，但同时，需要注意的是，Spring
 * 环境并不知道它是一个Bean，我们仍然需要把它注册到Spring环境中，可以使用两种方法，一种是在xml文件中
 * 直接声明这个bean：<bean id = .. class = ..>，另一种也是我最喜欢的，利用注解自动声明：@Component
 * 
 * 切面的通知过程可以分为以下的几点（AspectJ也是一样具有这些功能的）：
 * 1.在切点执行前通知 before
 * 2.在切点执行后通知 after
 * 3.在切点抛出异常后通知 throw
 * 4.环绕通知 around，但是这里需要注意的是，在通知的过程中需要来回转移控制权
 * 5.从被通知方法中获取参数，传递到通知方法中
 * */