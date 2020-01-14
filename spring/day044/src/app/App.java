package app;

import java.util.ArrayList;

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
		UserVO user = new UserVO("id98","pwd98","ÄáÀÚ¹Ý");
		try {
			//UserVO dbuser = null;
//			dbuser = 
//			serv.get("id01");
			serv.register(user);
			System.out.println("Register OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		factory.close();
		
		
		
		
	}
 
}