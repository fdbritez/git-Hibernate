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
public class Proveedor implements Serializable{
    private List<CompraCab> compracabs = new ArrayList();
    private int id_proveedor;
    private String des_proveedor;
    private String direccion_proveedor;
    private String telefono_proveedor;

    @OneToMany(mappedBy = "proveedor")
    public List<CompraCab> getCompracabs() {
        return compracabs;
    }

    public void setCompracabs(List<CompraCab> compracabs) {
        this.compracabs = compracabs;
    }

    public String getDes_proveedor() {
        return des_proveedor;
    }

    public void setDes_proveedor(String des_proveedor) {
        this.des_proveedor = des_proveedor;
    }

    public String getDireccion_proveedor() {
        return direccion_proveedor;
    }

    public void setDireccion_proveedor(String direccion_proveedor) {
        this.direccion_proveedor = direccion_proveedor;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getTelefono_proveedor() {
        return telefono_proveedor;
    }

    public void setTelefono_proveedor(String telefono_provedor) {
        this.telefono_proveedor = telefono_provedor;
    }
            
}
