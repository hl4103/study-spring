package cn.com.hlql.create.factory_bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 变种的实例工厂，把工厂方法统一都叫：getObject
 * @author tom
 *
 */
public class SomeBean4FactoryBean implements FactoryBean<SomeBean4> {

	// 实例工厂方法
	@Override
	public SomeBean4 getObject() throws Exception {
		return new SomeBean4();
	}

	@Override
	public Class<?> getObjectType() {
		return SomeBean4.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
