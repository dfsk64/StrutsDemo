package com.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport {
	private String userName;
	private String password;

	public String execute() {
		Connection conn = null;
		String DB_URL = "jdbc:mysql://localhost/auth";
		String returnmsg = ERROR;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, "root", "123456");
			String sql = "SELECT username FROM user WHERE username = ? AND password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				userName = rs.getString(1);
				returnmsg = SUCCESS;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return returnmsg;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
