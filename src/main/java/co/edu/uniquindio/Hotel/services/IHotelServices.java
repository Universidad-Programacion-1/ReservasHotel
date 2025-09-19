package co.edu.uniquindio.Hotel.services;

import co.edu.uniquindio.Hotel.model.Cliente;
import co.edu.uniquindio.Hotel.model.Habitacion;
import co.edu.uniquindio.Hotel.model.Reserva;

import java.util.Date;

public interface IHotelServices extends IReservaServices, IHabitacionServices, IClienteServices {


//    boolean agregarReserva(Date fechaEntrada, Date fechaSalida, Habitacion habitacionAsociada, Cliente cliente);

    Cliente obtenerCliente(String id);
}
