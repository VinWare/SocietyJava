package org.vvar.societyhub.dao;

import org.vvar.societyhub.beans.User;

import javax.validation.constraints.NotNull;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDAO extends BaseDAO{
	public User login(@NotNull String username, @NotNull String password) {
		connect();
		boolean loggedIn = false;
		String sql="SELECT * FROM account WHERE acc_name='" + username + "' AND acc_pass=" + password + "'";
		System.out.println(sql);
		User user = null;
		try(var statement = connection.createStatement();
		    var resultSet = statement.executeQuery(sql)) {
			if(resultSet.next()) {
				String accPass = resultSet.getString("acc_pass");
					String accName = resultSet.getString("acc_name");
					int flatId = resultSet.getInt("flat_id");
					String ownerName = resultSet.getString("owner_name");
					double pendingDues = resultSet.getDouble("pending_dues");
					String profileImg = resultSet.getString("profile_img");
					user = new User(accName,flatId,accPass,ownerName,pendingDues,profileImg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		disconnect();
		return user;
	}
}
