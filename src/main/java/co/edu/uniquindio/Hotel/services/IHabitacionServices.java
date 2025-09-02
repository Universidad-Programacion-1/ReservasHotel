package co.edu.uniquindio.Hotel.services;

import co.edu.uniquindio.Hotel.model.Habitacion;
import co.edu.uniquindio.Hotel.tipos.TipoHabitacion;

public interface IHabitacionServices {

    boolean agregarHabitacion(int numero,
                              TipoHabitacion tipoHabitacion,
                              int precio);

    Habitacion obtenerHabitacion(int numero);

    boolean eliminarHabitacion(int numero);

    boolean actualizarHabitacion(int numero,
                                 TipoHabitacion tipoHabitacion,
                                 int precio);
}
