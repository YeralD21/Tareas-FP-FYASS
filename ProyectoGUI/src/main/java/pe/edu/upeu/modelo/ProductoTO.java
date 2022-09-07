package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoTO {
    //IdProducto    Nombre  pu  utilidad    IdCate  IdMarca stock
    public String IdProducto, nombre;
    public double pu, utilidad;
    public int stock; 
    
}
