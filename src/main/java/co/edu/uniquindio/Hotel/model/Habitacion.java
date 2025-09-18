package co.edu.uniquindio.Hotel.model;

import co.edu.uniquindio.Hotel.tipos.TipoHabitacion;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int numero;
    private TipoHabitacion tipoHabitacion;
    private int precio;
    private Hotel hotel;

    public Habitacion() {
    }

    public Habitacion(int numero, TipoHabitacion tipoHabitacion, int precio) {
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }
    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
//    public List<ServicioHabitacion> getListaServiciosHabitacion() {
//        return listaServiciosHabitacion;
//    }
//    public void setListaServiciosHabitacion(List<ServicioHabitacion> listaServiciosHabitacion) {
//        this.listaServiciosHabitacion = listaServiciosHabitacion;
//    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", tipoHabitacion=" + tipoHabitacion +
                ", precio=" + precio +
                '}';
    }
}
