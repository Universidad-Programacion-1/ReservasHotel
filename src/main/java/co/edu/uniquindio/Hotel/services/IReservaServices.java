package co.edu.uniquindio.Hotel.services;

import co.edu.uniquindio.Hotel.model.Cliente;
import co.edu.uniquindio.Hotel.model.Habitacion;
import co.edu.uniquindio.Hotel.model.Reserva;

import java.util.Date;

public interface IReservaServices {

    boolean agregarCliente(Date fechaEntrada,
                           Date fechaSalida,
                           Habitacion habitacionAsociada);

    Reserva obtenerCliente(String id);

    boolean eliminarCliente(String id);


    boolean actualizarCliente(String nombre);

}
