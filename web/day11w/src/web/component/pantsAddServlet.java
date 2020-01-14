package web.component;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.dao.PantsDao;
import web.vo.PantsVO;

/**
 * Servlet implementation class pantsAddServlet
 */
@WebServlet({ "/pantsAddServlet", "/pantsAdd" })
public class pantsAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PantsDao dao = null ;  
	
    public pantsAddServlet() {
        super();
        dao = new PantsDao();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int amount = Integer.parseInt(request.getParameter("amount"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		PantsVO pants = new PantsVO(id, name, amount, price);
		try {
			dao.insert(pants);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		response.sendRedirect("index.html");//main.jsp濡� �씠�룞
		
		
	}

}
