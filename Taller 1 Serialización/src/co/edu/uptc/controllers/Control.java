package co.edu.uptc.controllers;

import java.io.IOException;

import co.edu.uptc.models.*;

public class Control {

    public void run() throws IOException, ClassNotFoundException {
        // Se crea un objecto SerializeObjects
        Serialization so = new Serialization();
        // Se llama al metodo serializeObjects
        so.serializeObjects();
        // Se imprime un objeto de la clase animal devuelto por el metodo
        // deserealizeObjects
        System.out.println(so.deserealizeObjects());
    }

}
