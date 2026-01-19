/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApp;
import java.sql.*;
/**
 *
 * @author anukulchandra
 */
public class SQLConnection {
    
	static Connection conn;

	public static Connection ConnecrDb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn;
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hall", "root", "");
			System.out.println("Connected ok");
			// JOptionPane.showMessageDialog(null, "Connected");
			return conn;
		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "Database Connection Failed");
			return null;
		}
	}
}
    

