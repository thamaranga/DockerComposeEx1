package com.hasithat.docker.util;

import java.sql.*;
import javax.naming.*;
import javax.sql.*;

public class DBConnectionUtility {

	public static Connection getDBConnection() {

		Connection conn = null;
		try {


			Class.forName ("com.mysql.cj.jdbc.Driver").newInstance();
			//conn = DriverManager.getConnection("jdbc:mysql://localhost/school", "root", "root123");
			//When using docker compose it automatically create a bridge network  for the application services which we defined in the docker-compose.yaml file.Here we can access school database using  mysql container name (app-db) since  both web application and mysql container have connected to the network created by docker-compose.
			conn = DriverManager.getConnection("jdbc:mysql://app-db/school", "root", "root123");


			return conn;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private static void log(Object aObject) {
		System.out.println(aObject);
	}
}
