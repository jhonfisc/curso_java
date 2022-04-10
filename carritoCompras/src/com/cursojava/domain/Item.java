package com.cursojava.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.text.DecimalFormat;

@XmlRootElement(name = "item")
@XmlType(propOrder = {"id", "nombreItem", "precio"})
public class Item {
    private String id;
    private String nombreItem;
    private Double precio;

    @XmlAttribute(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "nombreItem")
    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    @XmlElement(name = "precio")
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("$#,###.00");
        return id + ". " + nombreItem + " " + decimalFormat.format(precio);
    }
}
