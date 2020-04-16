/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author fdbritez
 */
@Entity
@Table(name ="ventacab")
public class VentaCab implements Serializable {
  private List<VentaDet> ventaDets = new ArrayList<>();

    
  private Cliente cliente;
  private int id_ventaCab;
  private Funcionario funcionario;
  private Calendar fecha;
  private long total;
    @Temporal(javax.persistence.TemporalType.DATE)
    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
   @ManyToOne
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId_ventaCab() {
        return id_ventaCab;
    }

    public void setId_ventaCab(int id_ventaCab) {
        this.id_ventaCab = id_ventaCab;
    }

    @ManyToOne 
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @OneToMany(mappedBy = "ventaCab",cascade= CascadeType.ALL)
    public List<VentaDet> getVentaDets() {
        return ventaDets;
    }

    public void setVentaDets(List<VentaDet> ventaDets) {
        this.ventaDets = ventaDets;
    }
  
}
