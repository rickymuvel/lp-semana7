package patronDataAccessObjec;

public abstract class  Factory {

	public static final int TIPO_MYSQL =1;
	public static final int TIPO_SQL_SERVER =2;
	
	
	public abstract UsuarioDao getUsuario();
	public abstract ProductoDao getProducto();
	
	
	public static Factory getTipo(int tipo){
		switch (tipo) {
		case TIPO_MYSQL:
			return new MySqlFactory();
		case TIPO_SQL_SERVER:
			return new SqlServerFactory();
		
		}
		
		return null;
	}
	
	
}
