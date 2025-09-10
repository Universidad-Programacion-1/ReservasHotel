package co.edu.uniquindio.Hotel.model;

import co.edu.uniquindio.Hotel.services.IHotelServices;
import co.edu.uniquindio.Hotel.tipos.TipoHabitacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel implements IHotelServices {
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Reserva> listaReservas = new ArrayList<>();
    private List<ServicioHabitacion> listaServicioHabitaciones = new ArrayList<>();
    private List<Habitacion> listaHabitaciones = new ArrayList<>();
    private String nombre;

    public Hotel() {
    }

    public Hotel(List<Cliente> listaClientes, List<Reserva> listaReservas, List<ServicioHabitacion> listaServicioHabitaciones, List<Habitacion> listaHabitaciones, String nombre) {
        this.listaClientes = listaClientes;
        this.listaReservas = listaReservas;
        this.listaServicioHabitaciones = listaServicioHabitaciones;
        this.listaHabitaciones = listaHabitaciones;
        this.nombre = nombre;

    }

    public void solicitarServicioHabitacion (){}

    public void calcularPago (){}

    public Hotel(String nombre) {
        this.nombre = nombre;
    }
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public List<ServicioHabitacion> getListaServicioHabitaciones() {
        return listaServicioHabitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }


//    public void crearReserva(Date fechaEntrada, Date fechaSalida, Habitacion habitacionAsociada;) {
//        VehiculoCarga vehiculoObj = new VehiculoCarga(placa, modelo, marca, color, capacidad);
//        vehiculoObj.setNumeroEjes(ejes);
//
//        Propietario propietarioObj = new Propietario(nombre, id, email, celular, edad, vehiculoObj);
//
//        listaPropietarios.add(propietarioObj);
//        listaVehiculosCarga.add(vehiculoObj);
//    }

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

    @Override
    public boolean agregarCliente(String nombre, String id, int reservasActivas, List<Reserva> listaReservasAsociadas) {
        return false;
    }

    @Override
    public boolean agregarHabitacion(int numero, TipoHabitacion tipoHabitacion, int precio) {
        return false;
    }

    @Override
    public Habitacion obtenerHabitacion(int numero) {
        return null;
    }

    @Override
    public boolean eliminarHabitacion(int numero) {
        return false;
    }

    @Override
    public boolean actualizarHabitacion(int numero, TipoHabitacion tipoHabitacion, int precio) {
        return false;
    }

    @Override
    public boolean agregarCliente(Date fechaEntrada, Date fechaSalida, Habitacion habitacionAsociada) {
        return false;
    }

    @Override
    public Reserva obtenerCliente(String id) {
        return null;
    }

    @Override
    public boolean eliminarCliente(String id) {
        return false;
    }

    @Override
    public boolean actualizarCliente(String nombre) {
        return false;
    }

    @Override
    public boolean agregarReserva(Date fechaEntrada, Date fechaSalida, Habitacion habitacionAsociada, int id) {
        Reserva reserva = new Reserva(fechaEntrada,fechaSalida, habitacionAsociada, id);
        reserva.setHabitacionAsociada(habitacionAsociada);
        reserva.setFechaEntrada(fechaEntrada);
        reserva.setFechaSalida(fechaSalida);
        reserva.setId(id);

        listaReservas.add(reserva);
        return false;
    }

    @Override
    public Reserva obtenerReserva(String id) {
        return null;
    }

    @Override
    public boolean eliminarReserva(String id) {
        Reserva reserva = obtenerReserva(id);
        if(reserva != null){
            getListaReservas().remove(reserva);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean actualizarReserva(String nombre) {
        return false;
    }
}
