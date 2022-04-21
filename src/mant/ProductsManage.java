package mant;

import classes.Products;
import com.mysql.cj.xdevapi.Statement;
import dbconecciones.dbconection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ProductsManage {
    
     //Metodo para añadir productos a la tabla y base de datos.
    public int addproducts (Products product) {
		
		int reg = 0;
                                
                                //Query para añadir producto a la base de datos o tabla.
		String sql = "insert into products values(?,?,?,?,?)";
		
                    //try catch para asignar valores
		try(PreparedStatement pstm = dbconection.getconnect().prepareStatement(sql)){   
			
                    //Asignar valores que obtenemos de los get
                    
		 pstm.setString(1, product.getNombre());
		 pstm.setString(2, product.getMarca());
		 pstm.setString(3, product.getCategoria());
		 pstm.setString(4, product.getPrecio());
		 pstm.setString(5, product.getCantidad_Dispo());
		 
		 
		 reg = pstm.executeUpdate();
		 
		 
			
		} catch (SQLException e) {
			
			
		}
		
		return reg;
	}

    public PreparedStatement prepareStatement(String select_NombreMarcaCategoriaPrecioCantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    }
    

