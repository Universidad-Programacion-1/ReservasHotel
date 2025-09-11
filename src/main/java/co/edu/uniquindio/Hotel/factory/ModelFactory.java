package co.edu.uniquindio.Hotel.factory;


import co.edu.uniquindio.Hotel.builder.HotelBuilder;
import co.edu.uniquindio.Hotel.model.Cliente;
import co.edu.uniquindio.Hotel.model.Habitacion;
import co.edu.uniquindio.Hotel.model.Hotel;
import co.edu.uniquindio.Hotel.model.Reserva;
import co.edu.uniquindio.Hotel.services.IModelFactoryServices;
import co.edu.uniquindio.Hotel.tipos.TipoHabitacion;

import java.util.Date;

public class ModelFactory implements IModelFactoryServices {

    private static ModelFactory instance;
    Hotel hotel;

    private ModelFactory() {}

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    public Hotel inicializarDatos() {
        Hotel hotel = new Hotel("Holel Sanfrancisco");
        Cliente cliente = new Cliente("Carlos", "1234", 2);
        Cliente cliente2 = new Cliente("Jose", "12345", 5);
        Cliente cliente3 = new Cliente("Chavez", "123456", 0);
        Habitacion habitacion = new Habitacion(100, TipoHabitacion.SUITE, 500000);
        Habitacion habitacion1 = new Habitacion(80, TipoHabitacion.SIMPLE, 200000);
        Habitacion habitacion2 = new Habitacion(110, TipoHabitacion.DOUBLE, 400000);
        Date fecha = new Date(2026, 05,15);
        Date fecha1 = new Date(2026, 06,15);
        Date fecha2 = new Date(2025, 11,30);
        Date fecha3 = new Date(2026, 01,01);
        Reserva reserva = new Reserva(fecha, fecha1, habitacion, "1234");
        Reserva reserva1 = new Reserva(fecha2, fecha3, habitacion2, "12345");
        hotel.getListaClientes().add(cliente);
        hotel.getListaClientes().add(cliente2);
        hotel.getListaClientes().add(cliente3);
        hotel.getListaHabitaciones().add(habitacion);
        hotel.getListaHabitaciones().add(habitacion1);
        hotel.getListaHabitaciones().add(habitacion2);
        hotel.getListaReservas().add(reserva);
        hotel.getListaReservas().add(reserva1);
        this.hotel = hotel;
        return hotel;
    }


    public boolean agregarCliente(String nombre, String id, int reservasActivas) {
        return hotel.agregarCliente(nombre, id, reservasActivas);
    }

    public Cliente obtenerCliente(String DNI) {
        return hotel.obtenerCliente(DNI);
    }

    public boolean eliminarCliente(String DNI) {
        return hotel.eliminarCliente(DNI);
    }

    @Override
    public boolean actualizarCliente(String DNI, String nuevoNombre, int nuevasReservasActivas) {
        return false;
    }


    @Override
    public boolean agregarHabitacion(int numero, TipoHabitacion tipoHabitacion, int precio) {
        return false;
    }

    public Habitacion obtenerHabitacion(int numero) {
        return hotel.obtenerHabitacion(numero);
    }

    public boolean eliminarHabitacion(int numero) {
        return hotel.eliminarHabitacion(numero);
    }

    public boolean actualizarHabitacion(int numero, TipoHabitacion tipoHabitacion, int precio) {
        return hotel.actualizarHabitacion(numero, tipoHabitacion, precio);
    }

    @Override
    public boolean agregarReserva(Date fechaEntrada, Date fechaSalida, Habitacion habitacionAsociada, String id) {
        return hotel.agregarReserva(fechaEntrada, fechaSalida, habitacionAsociada, id);
    }

    @Override
    public Reserva obtenerReserva(String id) {
        return null;
    }

    @Override
    public boolean eliminarReserva(String id) {
        return false;
    }

    @Override
    public boolean actualizarReserva(String id, Date nuevaEntrada, Date nuevaSalida, Habitacion nuevaHabitacion) {
        return false;
    }

//    public Hotel getHotel() {
//        return hotel;
//    }


}



