package co.edu.uniquindio.Hotel.model;

import java.util.Date;

public class Reserva {

    private Date fechaEntrada;
    private Date fechaSalida;
    private Habitacion habitacionAsociada;
    private Cliente clienteAsociada;

    public Reserva(Date fechaEntrada,Date fechaSalida,Habitacion habitacionAsociada, Cliente clienteAsociada ) {
        this.habitacionAsociada = habitacionAsociada;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.clienteAsociada = clienteAsociada;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Habitacion getHabitacionAsociada() {
        return habitacionAsociada;
    }

    public void setHabitacionAsociada(Habitacion habitacionAsociada) {
        this.habitacionAsociada = habitacionAsociada;
    }

    public Cliente getClienteAsociada() {
        return clienteAsociada;
    }

    public void setClienteAsociada(Cliente clienteAsociada) {
        this.clienteAsociada = clienteAsociada;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                ", habitacionAsociada=" + habitacionAsociada +
                ", clienteAsociada=" + clienteAsociada +
                '}';
    }
}
