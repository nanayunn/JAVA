package web.dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/DispatcherServlet", "/dispatcher" })
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DispatcherServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));

		path = path.substring(1, path.lastIndexOf("."));
		String next = "main.jsp";
		if(path.equals("main")){
			String view = request.getParameter("view");
			if(view != null){
				build(request, view);
			}
			next = "main.jsp";
		}else{
			next = path;
		}
		RequestDispatcher rd = 
		request.getRequestDispatcher(next);
		rd.forward(request, response);
	}
	
	
	// make ui
	private void build(HttpServletRequest request,
			   String view){
			  if(view.equals("login")) {
			   request.setAttribute("navi", Navi.login);
			   //Navi.login은 단순 String 데이터
			   request.setAttribute("center", "login");
			   
			  }else if(view.equals("register")) {
			   request.setAttribute("navi", Navi.register);
			   request.setAttribute("center", "register");
			  }else if(view.equals("pantsAdd")) {
			   request.setAttribute("navi", Navi.pantsAdd);
			   request.setAttribute("center", "pantsAdd");
			  }else if(view.equals("pantsList")) {
			   request.setAttribute("navi", Navi.pantsList);
			   request.setAttribute("center", "pantsList");
			  }else if(view.equals("pantsUpdate")) {
			   request.setAttribute("navi", Navi.pantsUpdate);
			   request.setAttribute("center", "pantsUpdate");
			  }
			  
			 }
	
	

}




