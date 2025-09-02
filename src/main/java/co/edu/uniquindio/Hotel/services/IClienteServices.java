package co.edu.uniquindio.Hotel.services;

import co.edu.uniquindio.Hotel.model.Cliente;
import co.edu.uniquindio.Hotel.model.Reserva;

import java.util.ArrayList;
import java.util.List;

public interface IClienteServices {

    boolean agregarCliente(String nombre,
                           String id,
                           int reservasActivas,
                           List<Reserva> listaReservasAsociadas);

    Cliente obtenerCliente(String id);

    boolean eliminarCliente(String id);


    boolean actualizarCliente(String nombre);
}
