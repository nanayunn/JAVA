package web.component;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.dao.PantsDao;
import web.vo.PantsVO;

/**
 * Servlet implementation class pantsListServlet
 */
@WebServlet({ "/pantsListServlet", "/pantsList" })
public class pantsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<PantsVO> list = null;
	PantsDao dao = null;
	
    public pantsListServlet() {
        super();
       dao = new PantsDao();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = null;
		
		try {
			list = dao.get();
//			System.out.println(list.toString());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		request.setAttribute("pantsList", list);
		
		rd = request.getRequestDispatcher("main.small?view=pantsList");
		rd.forward(request, response);
		
		
	}

}
