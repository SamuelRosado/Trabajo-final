package dbconecciones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconection {
		
    //Metodo de coneccion de base de datos.
	public static Connection getconnect() {
			
			Connection connect = null;
		 try {
			 Class.forName ("com.mysql.jdbc.Driver");               //Controlador
			 String URL = "jdbc:mysql://localhost:3306/javalogin";      //Direccion base de datos
			 String USER = "root";                                  //Usuario de la base de datos
			 String PASWORD = "goldmaster";                         //Contraseña del usuario de la base de datos
			 
			 connect = DriverManager.getConnection(URL,USER,PASWORD);   //Driver para que inicie sesion a la base de datos
			 			 
		} catch (ClassNotFoundException e) {
			System.out.println("Error en el DRIVER");                   
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("Error con la Base de datos");

			e.printStackTrace();
		} 
		 return connect;
		}
}
