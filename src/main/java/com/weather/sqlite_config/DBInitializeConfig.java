package com.weather.sqlite_config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBInitializeConfig {

	@Autowired
	private DataSource dataSource;
	
	@PostConstruct
	public void initialize(){
		try {
			Connection connection = dataSource.getConnection();
			Statement statement = connection.createStatement();
			statement.execute("DROP TABLE IF EXISTS City");
			statement.executeUpdate(
					"CREATE TABLE City(" +
					"id INTEGER Primary key, " +
					"name varchar(30) not null,"+ 
					")" 
					);
			statement.executeUpdate(
					"INSERT INTO City " +
					"(name) " +
					"VALUES " + "('delhi')"
					);
			statement.close();
			connection.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
