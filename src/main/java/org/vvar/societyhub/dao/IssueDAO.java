package org.vvar.societyhub.dao;

import org.vvar.societyhub.beans.Issue;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IssueDAO extends BaseDAO{
	public List<Issue> listIssues(long flatId) {
		connect();
		List<Issue> ret = new ArrayList<>( );
		String issuesQuery = "SELECT issue_date, issue_desc, related FROM issues WHERE acc_name IN (SELECT acc_name FROM account WHERE flat_id=" + flatId + ") ORDER BY issue_date";
		
		try(var statement = connection.createStatement();
		    var resultSet = statement.executeQuery(issuesQuery)) {
			while(resultSet.next()) {
				String date = resultSet.getString("issue_date");
				String desc = resultSet.getString("issue_desc");
				String related = resultSet.getString("related");
				ret.add(new Issue(date,desc,related));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	public void insertIssue(String accName, String curr_date, String complaint, String related){
		connect();
		
		String sql = "INSERT INTO issues(acc_name, issue_date, issue_desc, reported_by, related) VALUES('" + accName + "', '"+ curr_date + "', '" + complaint + "', '', '" + related + "')";
		try (var statement = connection.createStatement()) {
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		disconnect();
	}
}
