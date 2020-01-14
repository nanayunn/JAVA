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
 * Servlet implementation class getPantsServlet
 */
@WebServlet({ "/getPantsServlet", "/getPants" })
public class getPantsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PantsDao dao = null;
    public getPantsServlet() {
        super();
        dao = new PantsDao();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PantsVO pants = null;
		try {
			pants = dao.get("id");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		request.setAttribute("pants", pants);
		
		RequestDispatcher rd = request.getRequestDispatcher("main.small?view=pantsUpdate");
		
		rd.forward(request, response);
		
	}

}
