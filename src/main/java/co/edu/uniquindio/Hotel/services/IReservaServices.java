package co.edu.uniquindio.Hotel.services;

import co.edu.uniquindio.Hotel.model.Cliente;
import co.edu.uniquindio.Hotel.model.Habitacion;
import co.edu.uniquindio.Hotel.model.Reserva;

import java.util.Date;

public interface IReservaServices {

    boolean agregarReserva(Date fechaEntrada,
                           Date fechaSalida,
                           Habitacion habitacionAsociada,
                           int id);

    Reserva obtenerReserva(String id);

    boolean eliminarReserva(String id);


    boolean actualizarReserva(String nombre);

}
