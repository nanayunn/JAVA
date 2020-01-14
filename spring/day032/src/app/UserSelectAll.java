package app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;

public class UserSelectAll {
	
	public static void main(String[] args) {
		//Start Spring Container
		AbstractApplicationContext factory
		=new GenericXmlApplicationContext("myspring.xml");
		
		
		Service<String,UserVO> serv = (Service)factory.getBean("uservice");

		ArrayList<UserVO> list = null;
		try {
			list = serv.get();
			for (UserVO u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		factory.close();

	}

}
