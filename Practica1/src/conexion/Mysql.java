package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Mysql {

	public static void main(String[] args) {
		Connection conn1=null;
		try {
			String url1="jdbc:mysql://sql2.freemysqlhosting.net/sql2265150";
			String user="sql2265150";
			String password="xR5!bP4%";
			conn1=DriverManager.getConnection(url1, user, password);
			if(conn1!=null) {
				System.out.println("Connected to database");
			}
		}catch(SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		/**
		try{
			String query="insert into Categorias values (?,?)";
			PreparedStatement pstm=conn1.prepareStatement(query);
			pstm.setInt(1, 3);
			pstm.setString(2, "Limpieza");
			pstm.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}**/
		
		try {
			String query="select * from Categorias";
			Statement st=conn1.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				int id=rs.getInt("id");
				String nombre=rs.getString("nombre");
				System.out.format("%s, %s \n", id, nombre);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn1.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
