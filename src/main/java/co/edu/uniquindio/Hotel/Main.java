package co.edu.uniquindio.Hotel;

import co.edu.uniquindio.Hotel.factory.ModelFactory;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory =  ModelFactory.getInstance();

        modelFactory.inicializarDatos();

        modelFactory.agregarCliente("Alejo", "123", 2);
//        System.out.println("Agregando " + modelFactory.obtenerCliente("1234"));
//        System.out.println("Agregando " + modelFactory.obtenerCliente("123"));

        Date fecha1 = new Date(2026, 06,15);
        Date fecha2 = new Date(2025, 11,30);

        modelFactory.agregarReserva(fecha1, fecha2, modelFactory.obtenerHabitacion(110), modelFactory.obtenerCliente("123"));
//        modelFactory.eliminarReserva("123");
        System.out.println("Agregando " + modelFactory.obtenerCliente("123"));
        System.out.println("Agregando " + modelFactory.obtenerCliente("1234"));
        modelFactory.obtenerReserva("123");
        System.out.println("Agregando " + modelFactory.obtenerReserva("123"));


    }
}