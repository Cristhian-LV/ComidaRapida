package pe.edu.upeu.asistencia.servicio;

import pe.edu.upeu.asistencia.modelo.Producto;

import java.util.List;

public interface ProductoServicioI {

    void save(Producto producto); //C

    List<Producto> findAll(); // R

    void update(Producto producto, int index); //U

    void delete(int index); //D

    Producto findById(int index); //Buscar

}
