package co.edu.uniquindio.Hotel.builder;

import co.edu.uniquindio.Hotel.model.Habitacion;
import co.edu.uniquindio.Hotel.model.Hotel;
import co.edu.uniquindio.Hotel.tipos.TipoHabitacion;

public class HabitacionBuilder {
    private int numero;
    private TipoHabitacion tipoHabitacion;
    private int precio;
//    private Hotel hotel;

    public HabitacionBuilder numero(int numero) {
        this.numero = numero;
        return this;
    }
    public HabitacionBuilder tipo(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
        return this;
    }
    public HabitacionBuilder precio(int precio) {
        this.precio = precio;
        return this;
    }
//    public HabitacionBuilder hotel(Hotel hotel) {
//        this.hotel = hotel;
//        return this;
//    }
    public Habitacion build() {
        return new Habitacion(numero, tipoHabitacion, precio);
    }
}
