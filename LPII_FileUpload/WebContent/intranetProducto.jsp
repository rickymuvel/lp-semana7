<jsp:include page="intranetValida.jsp" />
<html>
<head>
<title>Bienvenido a la Intranet</title>
<link href="css/estilos.css" rel="stylesheet" type="text/css">
</head>



<body background="images/apoyos/fondointranetsinfondo.jpg"
	leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0"
	marginheight="0" marginwidth="0">

<table cellspacing="0" cellpadding="0" width="100%" border="0">
	<tr>
		<td colspan="2">
			<jsp:include page="intranetCabecera.jsp" />
		</td>
	</tr>
	<tr>
		<td valign="top" width="190">
			<jsp:include page="intranetMenu.jsp" />
		</td>
		<td align="center" valign="top">
			<h1> Producto </h1>
			
			<!-- method=post  
				 No se vean los parametros en el browser -->
			
			<!-- 
				enctype="multipart/form-data"
				Pueda enviarse archivos en el formulario
			 -->
			<form action="producto" method="post" 
									enctype="multipart/form-data">
				<table>
					<tr>
						<td>Nombre</td>
						<td><input type="text" name="nombre" ></td>
					</tr>
					<tr>
						<td>Descripción</td>
						<td><input type="text" name="descripcion"></td>
					</tr>		
					<tr>
						<td>Precio</td>
						<td><input type="text" name="precio"></td>
					</tr>	
					<tr>
						<td>Stock</td>
						<td><input type="text" name="stock"></td>
					</tr>	
					<tr>
						<td>Categoría</td>
						<td>
							<select name="categoria">
								<option value="1">Anillos</option>
								<option value="2">Aretes</option>
								<option value="3">Brazalete</option>
							</select>
						</td>
					</tr>	
					<tr>
						<td>Estado</td>
						<td>
							<select name="estado">
								<option value="1">ACTIVO</option>
								<option value="2">INACTIVO</option>
							</select>
						</td>
					</tr>	
					<tr>
						<td>Imagen</td>
						<td>
							<input type="file" name="imagen">
						</td>
					</tr>									
					<tr>
						<td><input type="submit" value="enviar"></td>
						<td><input type="reset" value="borrar"></td>
					</tr>												
				</table>
			
			</form>	
		</td>
	</tr>

</table>
</body>
</html>
