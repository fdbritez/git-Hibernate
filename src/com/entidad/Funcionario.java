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
public class Funcionario implements Serializable {
 private List<CompraCab> compraCabs = new ArrayList<>();
  private List<VentaCab> ventacabs = new ArrayList<>();
  private int id_funcionario;
  private String nombre_funcionario;
  private String apellido_funcionario;
  private String direccion_funcionario;
  private String telefono_funcionario;
  private String cargo_funcionario;

    public String getApellido_funcionario() {
        return apellido_funcionario;
    }

    public void setApellido_funcionario(String apellido_funcionario) {
        this.apellido_funcionario = apellido_funcionario;
    }

    public String getCargo_funcionario() {
        return cargo_funcionario;
    }

    public void setCargo_funcionario(String cargo_funcionario) {
        this.cargo_funcionario = cargo_funcionario;
    }

    public String getDireccion_funcionario() {
        return direccion_funcionario;
    }

    public void setDireccion_funcionario(String direccion_funcionario) {
        this.direccion_funcionario = direccion_funcionario;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNombre_funcionario() {
        return nombre_funcionario;
    }

    public void setNombre_funcionario(String nombre_funcionario) {
        this.nombre_funcionario = nombre_funcionario;
    }

    public String getTelefono_funcionario() {
        return telefono_funcionario;
    }

    public void setTelefono_funcionario(String telefono_funcionario) {
        this.telefono_funcionario = telefono_funcionario;
    }
    @OneToMany(mappedBy = "funcionario")
    public List<VentaCab> getVentacabs() {
        return ventacabs;
    }

    public void setVentacabs(List<VentaCab> ventacabs) {
        this.ventacabs = ventacabs;
    }
  
   @OneToMany(mappedBy = "funcionario")
    public List<CompraCab> getCompraCabs() {
        return compraCabs;
    }

    public void setCompraCabs(List<CompraCab> compraCabs) {
        this.compraCabs = compraCabs;
    }
    
 
}
