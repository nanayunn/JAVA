package web.component;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.dao.CarDao;
import web.vo.CarVO;

/**
 * Servlet implementation class CarInsertServlet
 */
@WebServlet({ "/CarInsertServlet", "/cadd" })
public class CarInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 CarDao dao = null ;  
		
	    public CarInsertServlet() {
	        super();
	        dao = new CarDao();
	    }
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String name = request.getParameter("name");
			int price = Integer.parseInt(request.getParameter("price"));
			Double cc = Double.parseDouble(request.getParameter("cc"));
			
			CarVO car = new CarVO(0, name, price, cc, null);
			try {
				dao.insert(car);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			response.sendRedirect("index.html");//main.jsp濡� �씠�룞
			
			
		}

	}
