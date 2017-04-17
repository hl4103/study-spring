package cn.com.hlql.hello;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

	@Test
	public void test() {
		// 资源配置对象
		Resource resource = new ClassPathResource("applicationContext.xml");
		// 对象工厂
		BeanFactory bean = new XmlBeanFactory(resource);
		HelloWorld hello = null;
		
		// 第一种 Object getBean(String beanName);
//		hello = (HelloWorld) bean.getBean("helloWorld");
		// 第二种 T getBean(Class<T> beanType);
//		hello = bean.getBean(HelloWorld.class);
		// 第三种 T getBean(String beanName, Class<T> requiredType);
		hello = bean.getBean("helloWorld", HelloWorld.class);
		
		hello.sayHello();
	}

	@Test
	public void testMock() throws Exception {
		String cls = "cn.com.hlql.hello.HelloWorld";
		
		Class clz = Class.forName(cls);
		// 创建对象
		Constructor con = clz.getDeclaredConstructor();
		con.setAccessible(true);
		Object obj = con.newInstance();
		// 调用方法
		BeanInfo bean = Introspector.getBeanInfo(clz, Object.class);
		PropertyDescriptor[] pds = bean.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			if ("username".equals(pd.getName())) {
				pd.getWriteMethod().invoke(obj, "Tom");
			}
		}

		HelloWorld hello = (HelloWorld) obj;
		hello.sayHello();
	}

}
