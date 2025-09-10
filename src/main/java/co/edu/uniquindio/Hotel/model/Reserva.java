package co.edu.uniquindio.Hotel.model;

import java.util.Date;

public class Reserva {

    private Date fechaEntrada;
    private Date fechaSalida;
    private Habitacion habitacionAsociada;
    private String id;

    public Reserva(Date fechaEntrada,Date fechaSalida,Habitacion habitacionAsociada, String id ) {
        this.habitacionAsociada = habitacionAsociada;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.id = id;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public void setHabitacionAsociada(Habitacion habitacion) {
        this.habitacionAsociada = habitacion;
    }

    public String getId() {return id;}
    public void setId(String id) {
        this.id = id;
    }

}
