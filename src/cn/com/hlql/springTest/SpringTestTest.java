package cn.com.hlql.springTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 告诉JVM,把Spring容器直接运行在JVM之上.
@RunWith(SpringJUnit4ClassRunner.class)
// 默认从当前测试类路径, 去找当前测试类名-context.xml文件
@ContextConfiguration("classpath:cn/com/hlql/springTest/springtest.xml")
public class SpringTestTest {
	
	@Autowired
	private User u;
	
	@Test
	public void test() {
		System.out.println(u);
	}

}
