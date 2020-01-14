package db;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import common.UserVO;

public class App {
	
	public static void main(String[] args) {
		//Start Spring Container
		AbstractApplicationContext factory
		=new GenericXmlApplicationContext("myspring.xml");
		
		
		Biz<UserVO, String> biz = (Biz)factory.getBean("biz");
		UserVO user = new UserVO("id99","pwd99","ÄáÀÚ¹Ý");
		biz.register(user);
		biz.register(user);
	}

}
