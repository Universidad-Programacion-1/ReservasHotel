package co.edu.uniquindio.Hotel.model;

import co.edu.uniquindio.Hotel.builder.ClienteBuilder;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private String nombre;
    private String DNI;
    private int reservasActivas;

    private List<Reserva> listaReservasAsociadas = new ArrayList<>();

    public Cliente() {
    }
    public Cliente(String nombre, String DNI, int reservasActivas) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.reservasActivas = reservasActivas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public int getReservasActivas() {
        return reservasActivas;
    }
    public void setReservasActivas(int reservasActivas) {
        this.reservasActivas = reservasActivas;
    }
    public List<Reserva> getListaReservasAsociadas() {
        return listaReservasAsociadas;
    }
    public void setListaReservasAsociadas(List<Reserva> listaReservas) {
        this.listaReservasAsociadas = listaReservas;
    }
    public static ClienteBuilder builder() {
        return new ClienteBuilder();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", reservasActivas='" + reservasActivas + '\'' +
                '}';
    }
}
