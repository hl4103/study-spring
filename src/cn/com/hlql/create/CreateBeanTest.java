package cn.com.hlql.create;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/com/hlql/create/CreateBeanTest-context.xml")
public class CreateBeanTest {
	
	@Autowired
	private BeanFactory factory;

	@Test
	public void test1() {
		factory.getBean("someBean1");
	}

	@Test
	public void test2() {
		factory.getBean("someBean2");
	}

	@Test
	public void test3() {
		factory.getBean("someBean3");
	}

	@Test
	public void test4() {
		factory.getBean("someBean4");
	}
}
