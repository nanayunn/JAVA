package web.component;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.dao.CarDao;
import web.vo.CarVO;

/**
 * Servlet implementation class CarsListServlet
 */
@WebServlet({ "/CarsListServlet", "/clist" })
public class CarsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ArrayList<CarVO> list = null;
	CarDao dao = null;
	
    public CarsListServlet() {
        super();
       dao = new CarDao();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = null;
		
		try {
			list = dao.get();
//			System.out.println(list.toString());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		request.setAttribute("clist", list);
		
		rd = request.getRequestDispatcher("main.small?view=clist");
		rd.forward(request, response);
		
		
	}

}
