package co.edu.uniquindio.Hotel.builder;

import co.edu.uniquindio.Hotel.model.*;

import java.util.ArrayList;
import java.util.List;

public class HotelBuilder {
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Reserva> listaReservas = new ArrayList<>();
    private List<ServicioHabitacion> listaServicioHabitaciones = new ArrayList<>();
    private List<Habitacion> listaHabitaciones = new ArrayList<>();
    private String nombre;


    public HotelBuilder listaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
        return this;
    }
    public HotelBuilder listaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
        return this;
    }
    public HotelBuilder listaServicioHabitaciones(List<ServicioHabitacion> listaServicioHabitaciones) {
        this.listaServicioHabitaciones = listaServicioHabitaciones;
        return this;
    }
    public HotelBuilder listaHabitaciones (List<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
        return this;
    }
    public HotelBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public Hotel build (){
        return new Hotel(listaClientes, listaReservas,listaServicioHabitaciones, listaHabitaciones, nombre );
    }
}
