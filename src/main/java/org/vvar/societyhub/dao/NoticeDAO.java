package org.vvar.societyhub.dao;


import org.vvar.societyhub.beans.Notice;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NoticeDAO  extends BaseDAO{
	public List<Notice> getNoticeList(long societyId) {
		connect();
		String noticeQuery = "SELECT * FROM notices WHERE notices.society_id="+societyId;
//		String noticeQuery = "SELECT * FROM notices";
		List<Notice> ret = new ArrayList<>();
		
		
		try(var statement = connection.createStatement();
		    var resultSet = statement.executeQuery(noticeQuery)) {
			while(resultSet.next()) {
				String subject = resultSet.getString("notice_header");
				String date = resultSet.getString("notice_date");
				String body = resultSet.getString("notice_desc");
				ret.add(new Notice(subject,date,body));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
}
