package co.edu.uptc.models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    private String objectPath = "Taller 1 Serialización\\Data\\Animal.ser";

    // Este metodo serializa un objeto y lo almacena en el objectPath
    public void serializeObjects() throws IOException {
        Animal newAnimal = new Animal("Rocky", 30);
        try {
            // Se instancia una clase encargada de manejar el flujo de salida a un archivo
            // .ser el cual almacena el objeto Animal serializado
            FileOutputStream fos = new FileOutputStream(objectPath);
            // Se instancia una clase encargada de escribir la serializacion del objeto en
            // el archivo .ser
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Este metodo de la clase ObjectOutputStream se encarga de escribir en el
            // archivo serializado
            oos.writeObject(newAnimal);
            // Se cierran las clases
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    // Este metodo deserealiza un objeto y lo devuelve

    public Animal deserealizeObjects() throws ClassNotFoundException {
        Animal animal = new Animal();
        try {
            // Se instancia una clase encargada del flujo de entrada de un objeto
            // serializado
            FileInputStream fis = new FileInputStream(objectPath);
            // Se instancia una clase encargada de extraer el objeto serializado
            ObjectInputStream ois = new ObjectInputStream(fis);
            // Este metodo de la clase ObjectInputStream se encarga de castear el objeto
            // serializado a un objeto de tipo Animal
            animal = (Animal) ois.readObject();
            // Se cierran las clases
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return animal;
    }
}
