/**
 * @author 		zhanghu1
 * @date   		2015��8��8��
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
 * �Զ�װ��Bean�����ԣ����Բ���Ҫдproperty֮���xml���ԣ���ô����������
 * ʵ���Զ�װ��ķ�ʽ��
 * 1.byName����
 * 		��Ҫ�������Ե����ֱ���Ҫ��xml�ļ��е�һ��Bean��id��ͬ����ʵ���Զ�װ���ͬʱҲ��
 * 		һ������
 * 2.byType����
 * 		���Ĺ�����ʽ��byName�����Ƶģ�ֻ����������ƥ�����Ե����֣�����ƥ�����Ե����ͣ�
 * 		��Ѱ��һ��Bean�����������Ե�������ͬʵ���Զ�װ�䣬���ǣ�����ж��Bean������
 * 		������������ôSpring���׳��쳣����ʱ��Ҫ����Bean��primary��������עBean����ѡ
 * 3.constructor�Զ�װ��
 * 		��������ʹ�ù��캯�����װ���ʱ�򣬿������������ǩ����Զ�װ�䣬������ȥд
 * 		<constructor-arg>�������������ƻ������Ϊ���ܴ��ڶ������ƥ��Ĺ�������Ҳ����
 * 		���ڶ������ƥ���Bean��ͬ���ͣ�
 * 4.����Զ�װ��
 * 		��Spring�Զ���ѡ��ʹ�������Զ�װ��ķ�ʽ������Ĭ������ѡ�������Զ�װ�䣬�����
 * 		�ɹ�����ô��ѡ��byType���͵��Զ�װ�䣬ʵ��ʹ���м����������ðɣ���Ϊ�²ⲻ���ã�
 * 		�Ҹ��˹���
 * 
 * ʹ��ע��װ��Bean������
 * 		������Ҫ˵������Spring����Ĭ�Ͻ��û���ע���װ�䣬������Ҫ����
 * 		<context:annotation-config/>������һ���ܣ�ע��ͬʱ��Ҫ�������������ռ�
 * 		һ��������ɣ����ǾͿ��ԶԴ�������ע�⣬��ʶSpringӦ��Ϊ���ԡ������͹����������Զ�
 * 		װ��
 * 			one.@Autowiredע���ʹ��
 * 				���ע��ǳ���Ҫ��Ҳ�ǳ����ã������Ա�ע����ķ�����ֻҪ���Ǹ�������Ҫע������
 * 				һ��Bean���ԣ���ʹ�ǹ��캯��Ҳ���Ա�ע��ͬʱ������Ҳû�б�Ҫ��ȥдsetter�����ˣ�
 * 				��Ϊ�����ע����ֱ��д�ڶ������ĵط�����ʹ��private����Ҳû�����⣬���ע���
 * 				���ƾ��ǵ����Bean����ע���ʱ�򣬻��׳��쳣��ע�����ע�����õ���byType�ķ�ʽ
 * 				ʵ��ע��ģ�
 * 				ע��@Autowired ������ǿ��Լ�ģ�������׼�����Ի��߲��������ǿ���װ��ġ�
 * 					���@Autowiredע��ʧ�ܣ�����ʧ�ܣ��İ취��
 * 						��ѡ���Զ�װ�䣺
 * 							���Զ�װ���Ҳ������ʵ�Bean����û���ҵ�����ƥ���Bean��ʱ�����׳�Bean
 * 							δ������쳣��������ǲ�����ô���׳��쳣������ʹ�������ķ�ʽ���ƻ���
 * 							Spring����Լ������@Autowired(requried=false)���趨��һ����Ҫ����Spring
 * 							����ȥװ��ʱ�����ʧ�ܣ���ô�������Ǹ����Ի��߲���Ϊnull
 * 						�޶������Ե�������
 * 							��������ǣ����ж��Bean����װ������ʱ����������ͬ������ô��Ҳ���׳��쳣��
 * 							����Ľ���취����ȷָ����һ��Bean���Զ�װ�䣬ʹ��@Qualifier("BeanId")
 * 				�����Զ�����޶������ο�MyAnnotation��ע�⣬��������Ҫ�������ļ����������Bean�ģ�ͬʱ
 * 				���Զ�����ע���������ر��
 * 			two.@Injectע��
 * 				���ע����java��׼ʵ�ֵģ�������Spring��ܵģ�����ʹ�÷�����@Autowired���ƣ�ͬ��Ҳ
 * 				�����Լ������Զ����ע��
 * 			֮ǰ˵��Bean��װ�䶼���Զ�װ������Bean�����ã���ʵ������@Value("...")
 * �Զ����Bean
 * 		�����Bean���˸���һ�������飬�����Բ�����xml�ļ�������bean��id��class�ȵȣ���
 * 		��ô����������Ҫʹ������һ�ֱ�ǩ��<context��component-sacn>��ע�����������ռ䣩
 * 		Ϊ���Զ����Bean����Ҫʹ�õ������ע������ʶ��
 * 		1.@Component ��һ��ͨ�õĹ�����ע�⣬��ʶ����ΪSpring�������Ҳ��Ĭ�ϵ�ɨ��ע�⣬ʹ�÷���
 * 		���Բ鿴Guitar.java��__Instrumentalist.java�ļ�
 * 		���ǿ����Լ�������Ҫ���˵����������Ĳ鿴���79ҳ��80ҳ
 * 		2.����������ע���ǩ��û���漰��������ʱ��ȥѧϰ
 * */