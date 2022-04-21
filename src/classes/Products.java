package classes;


public class Products {
    
   private String Nombre; 
   private String Marca; 
   private String Categoria; 
   private String Precio; 
   private String Cantidad_Dispo;

   //Constructores
   
    public Products(String Nombre, String Marca, String Categoria, String Precio, String Cantidad_Dispo) {
            
              
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Categoria = Categoria;
        this.Precio = Precio;
        this.Cantidad_Dispo = Cantidad_Dispo;
    }
        
    //Constructor vacio.
    public Products() {
    }

    //Getters y Setters
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getCantidad_Dispo() {
        return Cantidad_Dispo;
    }

    public void setCantidad_Dispo(String Cantidad_Dispo) {
        this.Cantidad_Dispo = Cantidad_Dispo;
    }
    
   
}

