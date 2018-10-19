package clase4.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class testSQLInsert
{
	public static void main(String[] args)
	{
		Connection con = null;
		//Statement stm = null;
		PreparedStatement pstm = null;
		int intRs = 0;
		ResultSet rs = null;
		
		try
		{
			String driver="org.hsqldb.jdbcDriver";
			String url="jdbc:hsqldb:hsql://localhost/xdb";
			String usr="sa";
			String pwd="";
			
			// registro el driver JDBC
			Class.forName(driver);

			// me conecto
			con = DriverManager.getConnection(url,usr,pwd);
			
			// preparo una sentencia
			String sqlUpdate="UPDATE orden SET id_cliente = 5"
					+ " WHERE id_orden = 2";
			//String sqlInsert="INSERT INTO orden "//(id_cliente, id_empleado, fecha_generada, fecha_entregada)"
			//		+ " VALUES (4, 2, 1, '2016-11-16', '2015-10-16')";
			//stm = con.createStatement(); //prepareStatement(sql);
			
			//pstm = con.prepareStatement(sqlInsert); 
			pstm = con.prepareStatement(sqlUpdate); 
			intRs = pstm.executeUpdate();

			System.out.println("Insertó " + intRs + " filas");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally
		{
			try
			{
				if( rs!=null ) rs.close();
				if( pstm!=null ) pstm.close();
				if( con!=null ) con.close();				
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
				throw new RuntimeException(e2);
			}
		}
	}
}