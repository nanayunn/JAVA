package web.component;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.dao.PantsDao;
import web.vo.PantsVO;

/**
 * Servlet implementation class pantsUpdateServlet
 */
@WebServlet({ "/pantsUpdateServlet", "/pantsUpdate" })
public class pantsUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	PantsDao dao = null;
	
    public pantsUpdateServlet() {
        super();
        dao = new PantsDao();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//pants �뾽�뜲�씠�듃
		//�뾽�뜲�씠�듃�븯怨� pantsList.jsp濡� �떎�떆 �씠�룞
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int amount = Integer.parseInt(request.getParameter("amount"));
		int price = Integer.parseInt(request.getParameter("price"));
		System.out.println(id);
		
		
		PantsVO pants = new PantsVO(id, name, amount, price);
		try {
			dao.update(pants);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		response.sendRedirect("pantsList.small");
		
	}

}
