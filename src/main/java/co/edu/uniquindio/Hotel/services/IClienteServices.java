package co.edu.uniquindio.Hotel.services;

import co.edu.uniquindio.Hotel.model.Cliente;
import co.edu.uniquindio.Hotel.model.Reserva;

import java.util.ArrayList;
import java.util.List;

public interface IClienteServices {

    boolean agregarCliente(String nombre,
                           String id,
                           int reservasActivas);

    Cliente obtenerCliente(String DNI);

    boolean eliminarCliente(String DNI);


    boolean actualizarCliente(String nombre);
}
