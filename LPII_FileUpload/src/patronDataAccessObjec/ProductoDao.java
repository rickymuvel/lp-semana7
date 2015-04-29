package patronDataAccessObjec;

import java.sql.SQLException;

import entidad.Producto;

public interface ProductoDao {

	public int inserta(Producto p) throws SQLException;

	
}
