package co.edu.uniquindio.Hotel.factory;

import co.edu.uniquindio.Hotel.model.Hotel;

public class ModelFactory {

    private static ModelFactory instance;
    Hotel hotel;

    private ModelFactory() {}

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    public Hotel inicializarDatos() {
        Hotel hotel = new Hotel();
        hotel.setNombre("");
        this.hotel = hotel;
        return hotel;
    }


}
