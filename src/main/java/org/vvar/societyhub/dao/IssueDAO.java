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

		String getLatestIdSql = "SELECT MAX(issue_id) AS max_id FROM issues";
		int maxId=1;
		try (var statement = connection.createStatement()) {
			var resultSet = statement.executeQuery(getLatestIdSql);
			if(resultSet.next()) {
				maxId = resultSet.getInt("max_id") + 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql = "INSERT INTO issues(issue_id, acc_name, issue_date, issue_desc, reported_by, related) VALUES(" + maxId + ", '" + accName + "', TO_DATE('"+ curr_date + "', 'yyyy-mm-dd'), '" + complaint + "', '', '" + related + "')";
		System.out.println(sql);
		try (var statement = connection.createStatement()) {
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		disconnect();
	}
}
