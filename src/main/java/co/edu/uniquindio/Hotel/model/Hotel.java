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

    public boolean agregarCliente(String nombre, String DNI, int reservasActivas) {
        Cliente cliente = new Cliente(nombre, DNI, reservasActivas);
        return listaClientes.add(cliente);
    }

    public Cliente obtenerCliente(String DNI) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getDNI().equals(DNI)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean eliminarCliente(String DNI) {
        Cliente cliente = obtenerCliente(DNI);
        if (cliente != null) {
            listaClientes.remove(cliente);
            return true;
        }
        return false;
    }

    public boolean actualizarCliente(String DNI, String nuevoNombre, int nuevasReservasActivas) {
        Cliente cliente = obtenerCliente(DNI);
        if (cliente != null) {
            cliente.setNombre(nuevoNombre);
            cliente.setReservasActivas(nuevasReservasActivas);
            return true;
        }
        return false;
    }

    public boolean agregarHabitacion(int numero, TipoHabitacion tipoHabitacion, int precio) {
        Habitacion habitacion = new Habitacion(numero, tipoHabitacion, precio);
        return listaHabitaciones.add(habitacion);
    }

    public Habitacion obtenerHabitacion(int numero) {
        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getNumero() == numero) {
                return habitacion;
            }
        }
        return null;
    }

    public boolean eliminarHabitacion(int numero) {
        Habitacion habitacion = obtenerHabitacion(numero);
        if (habitacion != null) {
            listaHabitaciones.remove(habitacion);
            return true;
        }
        return false;
    }

    public boolean actualizarHabitacion(int numero, TipoHabitacion tipoHabitacion, int precio) {
        Habitacion habitacion = obtenerHabitacion(numero);
        if (habitacion != null) {
            habitacion.setTipoHabitacion(tipoHabitacion);
            habitacion.setPrecio(precio);
            return true;
        }
        return false;
    }

    public boolean agregarReserva(Date fechaEntrada, Date fechaSalida, Habitacion habitacionAsociada, int id) {
        Reserva reserva = new Reserva(fechaEntrada, fechaSalida, habitacionAsociada, id);
        return listaReservas.add(reserva);
    }

    public Reserva obtenerReserva(String id) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getId().equals(id)) {
                return reserva;
            }
        }
        return null;
    }

    public boolean eliminarReserva(String id) {
        Reserva reserva = obtenerReserva(id);
        if (reserva != null) {
            listaReservas.remove(reserva);
            return true;
        }
        return false;
    }

    public boolean actualizarReserva(String id, Date nuevaEntrada, Date nuevaSalida, Habitacion nuevaHabitacion) {
        Reserva reserva = obtenerReserva(id);
        if (reserva != null) {
            reserva.setFechaEntrada(nuevaEntrada);
            reserva.setFechaSalida(nuevaSalida);
            reserva.setHabitacionAsociada(nuevaHabitacion);
            return true;
        }
        return false;
    }


}
