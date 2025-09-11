package co.edu.uniquindio.Hotel;

import co.edu.uniquindio.Hotel.builder.ClienteBuilder;
import co.edu.uniquindio.Hotel.model.Cliente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = Cliente.builder().nombre("Alejo").DNI("123").reservasActivas(2).build();
    }
}