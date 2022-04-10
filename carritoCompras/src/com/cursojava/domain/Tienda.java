package com.cursojava.domain;

import com.cursojava.domain.Item;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name="tienda")
@XmlType(propOrder = {"nombre", "items", "descuentos"})
public class Tienda {

    private String nombre;
    private List<Item> items;
    private List<Descuento> descuentos;

    @XmlElement(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @XmlElementWrapper(name = "items")
    @XmlElement(name = "item")
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @XmlElementWrapper(name = "descuentos")
    @XmlElement(name = "descuento")
    public List<Descuento> getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(List<Descuento> descuentos) {
        this.descuentos = descuentos;
    }

}
