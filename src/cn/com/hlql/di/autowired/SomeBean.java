package cn.com.hlql.di.autowired;

public class SomeBean {

	private OtherBean other1;

	
	
	public OtherBean getOther1() {
		return other1;
	}



	public void setOther1(OtherBean other1) {
		this.other1 = other1;
	}



	@Override
	public String toString() {
		return "SomeBean [other1=" + other1 + "]";
	}

	
}
