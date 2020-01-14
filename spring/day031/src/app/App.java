package app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;

public class App {
	
	public static void main(String[] args) {
		//Start Spring Container
		AbstractApplicationContext factory
		=new GenericXmlApplicationContext("myspring.xml");
		
		
		Service<String,UserVO> serv = (Service)factory.getBean("uservice");
		UserVO user = new UserVO("id99","pwd99","ÄáÀÚ¹Ý");
		try {
			UserVO dbuser = null;
			dbuser = 
			serv.get("id99");
			System.out.println("App:"+dbuser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		factory.close();
		
		
		
		
	}
 
}
