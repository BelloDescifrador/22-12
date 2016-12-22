package com.database;
//import com.database.JDBCMySQLConnection;

public class Main {

	public static void main(String[] args) {

		//JDBCMySQLConnection obj= new JDBCMySQLConnection();
		
		MysqlCon obj=new MysqlCon();
		System.out.println(obj.func());
	}

}
