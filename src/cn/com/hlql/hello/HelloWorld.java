package cn.com.hlql.hello;


public class HelloWorld {

	private String username;

	public void sayHello() {
		System.out.println("Hello," + username);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
