package web.component;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.dao.PantsDao;

/**
 * Servlet implementation class pantsDeleteServlet
 */
@WebServlet({ "/pantsDeleteServlet", "/pantsDelete" })
public class pantsDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PantsDao dao = null;
	
    public pantsDeleteServlet() {
        super();
        dao = new PantsDao();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");

		
		try {
			dao.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("pantsList.small");
		
		
		//delete pants
		//�닔�뻾 �썑 main.jsp濡� �씠�룞
	}

}
