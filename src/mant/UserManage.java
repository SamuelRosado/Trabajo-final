package mant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import dbconecciones.dbconection;

import classes.Users;


public class UserManage {
	
	//Metodo para solicitar usuario y contraseña de la tabla usuarios de la base de datos.
	public Users obtenerUser(Users use){
	
		Users user = null;
		
		Connection conne= null;
		PreparedStatement pstm = null;
		ResultSet  rsult = null; 
                    
                //try catch para el login
		try {
			conne = dbconection.getconnect();   //Declarando variable de la coneccion
			
                                        //Query para seleccionar campos de la tabla usuarios (users)
			String sql = "select*from users where usuarios= ? and clave = ?";
			pstm = conne.prepareStatement(sql);
			pstm.setString(1, use.getUsuarios());
			pstm.setString(2, use.getClave());
			rsult = pstm.executeQuery();
			
                        //Condicion para acceder a cada campos y filas de la tabla usuarios (users)
			while(rsult.next()) {
                            
				user = new Users(rsult.getString(1), rsult.getString(2), rsult.getString(3), rsult.getString(4), rsult.getString(5), rsult.getString(6), rsult.getString(7));
			}
			
		} catch (Exception e) {
			System.out.println("Error en el usuario");
		}
		
		
		return user;
		
	}

}
