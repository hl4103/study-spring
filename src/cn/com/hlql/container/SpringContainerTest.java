package cn.com.hlql.container;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringContainerTest {

	@Test
	public void test1(){
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("cn/com/hlql/container/SpringContainerTest-context.xml"));
		SomeBean bean = factory.getBean("SomeBean", SomeBean.class);
		System.out.println(bean);
	}
	
	@Test
	public void test2(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cn/com/hlql/container/SpringContainerTest-context.xml");
		SomeBean bean = ctx.getBean("SomeBean", SomeBean.class);
		System.out.println(bean);
	}
}
