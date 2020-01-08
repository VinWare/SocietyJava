package org.vvar.societyhub.servlet;

import org.vvar.societyhub.beans.User;
import org.vvar.societyhub.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		if("/admin".equals(req.getPathInfo())) adminLogin(req, resp);
		else userLogin(req, resp);
	}
	
	private void userLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = new UserDAO().login(username,password);
		if(user == null) resp.getWriter().print("N");//resp.sendRedirect("/?failedLogin=true");
		else {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("accName", user.getAccName());
			httpSession.setAttribute("flatId", user.getFlatId());
			httpSession.setAttribute("ownerName", user.getOwnerName());
			resp.getWriter().print("OK");
//			resp.sendRedirect("/home");
		}
	}
	
	private void adminLogin(HttpServletRequest req, HttpServletResponse resp) {
	}
}
