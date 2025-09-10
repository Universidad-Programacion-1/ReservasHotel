package co.edu.uniquindio.Hotel.factory;


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

//    public Hotel inicializarDatos() {
//        Hotel hotel = new Hotel();
//        hotel.setNombre("");
//        this.hotel = hotel;
//        return hotel;
//    }


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



