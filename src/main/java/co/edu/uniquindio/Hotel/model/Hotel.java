package co.edu.uniquindio.Hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Reserva> listaReservas = new ArrayList<>();
    private List<ServicioHabitacion> listaServicioHabitaciones = new ArrayList<>();
    private List<Habitacion> listaHabitaciones = new ArrayList<>();
    private String nombre;

    public Hotel() {
    }

    public void reservaHavitacion (){}

    public void solicitarServicioHabitacion (){}

    public Hotel(String nombre) {
        this.nombre = nombre;
    }
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public List<Reserva> getListaReservas() {
        return listaReservas;
    }
    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }
    public List<ServicioHabitacion> getListaServicioHabitaciones() {
        return listaServicioHabitaciones;
    }
    public void setListaServicioHabitaciones(List<ServicioHabitacion> listaServicioHabitaciones) {
        this.listaServicioHabitaciones = listaServicioHabitaciones;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }
    public void setListaHabitaciones(List<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "listaClientes=" + listaClientes +
                ", listaReservas=" + listaReservas +
                ", listaServicioHabitaciones=" + listaServicioHabitaciones +
                ", listaHabitaciones=" + listaHabitaciones +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
