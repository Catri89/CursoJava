package clase4.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenDAO
{
	Connection con = Conexion.connection;
	PreparedStatement pstm = null;
	ResultSet rs = null;

	public List<Orden> buscarTodos()
	{
		try
		{
			// preparo una sentencia
			String sql="SELECT id_orden, fecha_generada, fecha_entregada "
					+ " FROM orden ";
			pstm = con.prepareStatement(sql);
			
			// obtengo el cursor
			rs = pstm.executeQuery();
			
			ArrayList<Orden> ret = new ArrayList<>();
			
			// iterar el resultSet
			while( rs.next() )
			{
				int idOrden = rs.getInt("idOrden");
				Date fechaGenerada = rs.getDate("fechaGenerada");
				Date fechaEntregada = rs.getDate("fechaEntregada");

				Orden c = new Orden();
				c.setIdOrden(idOrden);
				c.setFechaGenerada(fechaGenerada);
				c.setFechaEntregada(fechaEntregada);
			
				ret.add(c);
			}
			return ret;
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
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
				throw new RuntimeException(e2);
			}
		}
		
	}
	
	public Orden buscar(int idOrden)
	{
		try
		{
			// preparo una sentencia
			String sql="";
			sql+="SELECT id_orden, fecha_generada, fecha_entregada ";
		    sql+="FROM orden ";
		    sql+="WHERE id_orden=? ";
			pstm = con.prepareStatement(sql);

			// seteo el valor del parametro
			pstm.setInt(1,idOrden);
			
			// obtengo el cursor
			rs = pstm.executeQuery();
			
			Orden ret = null;
			
			// iterar el resultSet
			if( rs.next() )
			{
				int id = rs.getInt("idOrden");
				Date fechaGenerada = rs.getDate("fechaGenerada");
				Date fechaEntregada = rs.getDate("fechaEntregada");

				Orden o = new Orden();
				o.setIdOrden(id);
				o.setFechaGenerada(fechaGenerada);
				o.setFechaEntregada(fechaEntregada);

				if( rs.next() )
				{
					throw new RuntimeException("Mas de una fila con el mismo id ("+idOrden+")");
				}
			}
			
			return ret;
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
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
				throw new RuntimeException(e2);
			}
		}
	}
		
	public int update(int idTipoCliente, String descripcion)
	{
			try
			{
				// preparo una sentencia
				String sql="UPDATE tipo_cliente "
						+ "SET descripcion = ?"
						+ " WHERE id_tipo_cliente = ?";
				pstm = con.prepareStatement(sql);

				
				// seteo el valor del parametro
				pstm.setString(1,descripcion);
				pstm.setInt(2,idTipoCliente);
				
				
				return pstm.executeUpdate();
 
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
				}
				catch(Exception e2)
				{
					e2.printStackTrace();
					throw new RuntimeException(e2);
				}
			}
		}
	
	public int insert(int idTipoCliente, String descripcion)
	{
		try	
		{	
			// preparo una sentencia
			String sql="INSERT INTO tipo_cliente "
					+ " VALUES (?, ?)";
			pstm = con.prepareStatement(sql);
	
			// seteo el valor del parametro
			pstm.setInt(1,idTipoCliente);
			pstm.setString(2,descripcion);
					
			return pstm.executeUpdate();
	 
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
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
				throw new RuntimeException(e2);
			}
		}
	}
}