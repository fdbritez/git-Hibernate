/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author fdbritez
 */

@Entity
public class Cliente implements Serializable {
    private List<VentaCab> ventaCabs = new ArrayList<>();
    private int id_cliente;
    private String nombre_cliente;
    private String direccion_cliente;
    private String telefono_cliente;
    private String ruc;
    @Column(length = 255)
    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    @Column(length = 255)
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
    @Column(length = 255)
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    @Column(length = 255)
    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }
   
    @OneToMany(mappedBy = "cliente")
    public List<VentaCab> getVentaCabs() {
        return ventaCabs;
    }

    public void setVentaCabs(List<VentaCab> ventaCabs) {
        this.ventaCabs = ventaCabs;
    }
}
