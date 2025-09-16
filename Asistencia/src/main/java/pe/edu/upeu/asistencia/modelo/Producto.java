package pe.edu.upeu.asistencia.modelo;

import javafx.beans.property.StringProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upeu.asistencia.enums.Categorias;

import java.net.HttpCookie;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {

    private StringProperty nombre;
    private StringProperty precio;
    private StringProperty stock;
    private Categorias categoria;

}
