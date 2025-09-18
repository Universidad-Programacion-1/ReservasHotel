package co.edu.uniquindio.Hotel.builder;

import co.edu.uniquindio.Hotel.model.Cliente;
import co.edu.uniquindio.Hotel.model.Reserva;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ClienteBuilder {
    private String nombre;
    private String DNI;
    private int reservasActivas;
    private List<Reserva> reservasActivasList = new ArrayList<>();

    public ClienteBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public ClienteBuilder DNI(String DNI) {
        this.DNI = DNI;
        return this;
    }
    public ClienteBuilder reservasActivas(int reservasActivas) {
        this.reservasActivas = reservasActivas;
        return this;
    }
    public ClienteBuilder reservasActivasList(List<Reserva> reservasActivas) {
        this.reservasActivasList = reservasActivas;
        return this;
    }
    public Cliente build() {
        return new Cliente(nombre, DNI, reservasActivas);
    }
}
