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
 public class CompraCab implements Serializable {
   private List<CompraDet> compraDets = new ArrayList();
  // @ID
   private int id_compraCab;
 //  private int num;
   private Proveedor proveedor;
   private Funcionario funcionario;
   private Cliente cliente;
    @ManyToOne
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   private Calendar fecha;
   private String hora;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId_compraCab() {
        return id_compraCab;
    }

    public void setId_compraCab(int id_compraCab) {
        this.id_compraCab = id_compraCab;
    }
/*
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    * 
    * 
    */
    @ManyToOne
    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
     @OneToMany(mappedBy = "compracab",cascade= CascadeType.ALL)
    public List<CompraDet> getCompraDets() {
        return compraDets;
    }

    public void setCompraDets(List<CompraDet> compraDets) {
        this.compraDets = compraDets;
    }
   
}
