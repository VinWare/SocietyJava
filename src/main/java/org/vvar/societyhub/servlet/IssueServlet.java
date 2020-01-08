package org.vvar.societyhub.servlet;

import org.vvar.societyhub.dao.IssueDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/issues")
public class IssueServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.getWriter().print("Issues");
		var fid = req.getSession().getAttribute("flatId");
		if(fid==null) {
			resp.sendRedirect("/");
			return;
		}
		long flatId = Long.parseLong(fid.toString());
		var issuesList = new IssueDAO().listIssues(flatId);
		req.setAttribute("issuesList", issuesList);
		req.getRequestDispatcher("/user/usercomplaints.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		var rel= req.getParameter("relatedTo");
			String related = rel==null ? "None" : rel;
			String complaint = req.getParameter("complaints");
			String accName = (String) req.getSession().getAttribute("accName");
			String currDate = LocalDate.now().toString();
			new IssueDAO().insertIssue(accName,currDate,complaint,related);
			resp.sendRedirect("issues");
	}
}
