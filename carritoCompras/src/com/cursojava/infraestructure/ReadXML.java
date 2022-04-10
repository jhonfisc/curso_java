package com.cursojava.infraestructure;

import com.cursojava.domain.Tienda;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ReadXML {

    private static Tienda tienda;

    public static Tienda getTienda() {
        return tienda;
    }

    public static void setTienda(Tienda tienda) {
        ReadXML.tienda = tienda;
    }

    public Tienda get() {
        try {
            JAXBContext context = JAXBContext.newInstance(Tienda.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            File file = new File("TIENDA_JAVA.xml");
            ReadXML.setTienda((Tienda) unmarshaller.unmarshal(file));
            return ReadXML.getTienda();
        } catch (JAXBException ex) {
            System.out.println("Error leyendo la fuente de datos");
            return null;
        } catch (NullPointerException ex) {
            System.out.println(ex.getCause());
            return null;
        }
    }
}
