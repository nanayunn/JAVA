package db2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import common.UserVO;

public class App {
	
	public static void main(String[] args) {
		//Start Spring Container
		AbstractApplicationContext factory
		=new GenericXmlApplicationContext("total.xml");
		
		
		Biz<UserVO, String> biz = (Biz)factory.getBean("ubiz");
		UserVO user = new UserVO("id99","pwd99","ÄáÀÚ¹Ý");
		biz.register(user);
		biz.register(user);
	
		
//		Biz<UserVO, String> biz2 = (Biz)factory.getBean("biz");
//		UserVO user2 = new UserVO("id98","pwd98","Äá³ª¹°");
//		biz2.register(user2);
		
		factory.close();
		
		
		
		
	}
 
}
