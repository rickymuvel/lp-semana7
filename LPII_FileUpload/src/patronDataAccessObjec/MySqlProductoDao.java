package patronDataAccessObjec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import miConexion.MySqlDBConn;
import entidad.Producto;

public class MySqlProductoDao implements ProductoDao {

	@Override
	public int inserta(Producto p) throws SQLException {
		Connection conn= null;
		PreparedStatement pstm = null;
		int salida = -1;
		try {
			conn = new MySqlDBConn().getConnection();
			String sql ="insert into tb_producto values(null,?,?,?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, p.getNombre());
			pstm.setString(2, p.getDescripcion());
			pstm.setDouble(3, p.getPrecio());
			pstm.setInt(4, p.getStock());
			pstm.setInt(5, p.getCategoria());
			pstm.setInt(6, p.getEstado());
			pstm.setString(7, p.getNombreArchivo());
			pstm.setBytes(8, p.getArchivo());
			
			salida = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(pstm!= null) pstm.close();
				if(conn!= null) conn.close();
			} catch (Exception e2) {
			}
		}
		
		return salida;
	}

}
