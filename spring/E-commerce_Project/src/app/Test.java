package app;

import java.util.ArrayList;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.CategoryVO;
import com.vo.ProductVO;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("spring.xml");
		System.out.println("factory created");
		Service<String, ProductVO> biz = (Service) factory.getBean("shopservice");
		Service<String, CategoryVO> biz2 = (Service) factory.getBean("cateservice");
		ArrayList<ProductVO> list = null;
//	
		try {

			for(int i=7;i<=120;i++) {
				int imgnum= (int) (Math.random()*3);
				CategoryVO cvo = new CategoryVO(i, i, i);
				ProductVO vo = new ProductVO(i, "name"+i, 1000+(int)(Math.random()*10000), 
						(int)(Math.random()*100), "img0"+imgnum, i, (int)(Math.random()*100), "description"+i);
				
				biz2.register(cvo);
				biz.register(vo);
				
				list = biz.get();
				for(int j =0; j< list.size();j++) {
					System.out.println(list.get(j).toString());
				}
				
			}
			
			
			
			
	



		} catch (Exception e) {
			e.printStackTrace();
		}

		factory.close();
	}

}
