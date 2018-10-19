package clase4.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class testSQLSelect
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstm = null;
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
			//String sqlClientes="SELECT id_cliente, nombre, direccion, descripcion "
			//		+ "FROM cliente a, tipo_cliente b"
			//		+ "where a.id_tipo_cliente = b.id_tipo_cliente";
			String sqlOrden="SELECT * "
					+ "FROM orden ";
					//+ "where id_orden = 1";
			pstm = con.prepareStatement(sqlOrden);
			
			// obtengo el cursor
			rs = pstm.executeQuery();
			
			// iterar el resultSet
			while( rs.next() )
			{
				int idOrden= rs.getInt("id_orden");
				int idCliente = rs.getInt("id_cliente");
				int idEmpleado = rs.getInt("id_empleado");
				Date fecha_generada = rs.getDate("fecha_generada");
				Date fecha_entregada = rs.getDate("fecha_entregada");
				
				/*String nombre = rs.getString("nombre");
				String direccion = rs.getString("direccion");
				String tipoclien = rs.getString("descripcion");*/
				
				System.out.println(idOrden+","+idCliente+","+idEmpleado +","+fecha_generada+", "+fecha_entregada);
			}
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