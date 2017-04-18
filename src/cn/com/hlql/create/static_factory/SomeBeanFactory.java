package cn.com.hlql.create.static_factory;

public class SomeBeanFactory {

	// 静态工厂
	public static SomeBean2 getSomeBean2() {
		System.out.println("-------------");
		return new SomeBean2();
	}
}
