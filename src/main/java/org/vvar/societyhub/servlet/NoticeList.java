package org.vvar.societyhub.servlet;

import com.google.gson.Gson;
import org.vvar.societyhub.dao.NoticeDAO;
import org.vvar.societyhub.util.ToJson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/refreshNotices")
public class NoticeList extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//		var soc = req.getSession().getAttribute("societyId");
		var soc = (Object)1;
		if(soc==null) {
			resp.sendRedirect("index");
			return;
		}
		int societyId = Integer.parseInt(soc.toString());
		var list = new NoticeDAO().getNoticeList(societyId);
		ToJson toJson = new ToJson();
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().print(toJson.toJsonList(list,"notices"));
	}
}

