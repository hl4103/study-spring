package cn.com.hlql.di.autowired;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AutowireTest {
	
	@Autowired
	private SomeBean bean;

	@Test
	public void test1() {
		System.out.println(bean);
	}

}
