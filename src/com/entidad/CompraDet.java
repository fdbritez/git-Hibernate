/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author fdbritez
 */

@Entity
public class CompraDet implements Serializable {
   private int id_compradet;
   private CompraCab compracab;
   private Articulo articulo;
   private int cantidad_compradet;
   private long importe;
    @ManyToOne
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad_compradet() {
        return cantidad_compradet;
    }

    public void setCantidad_compradet(int cantidad_compradet) {
        this.cantidad_compradet = cantidad_compradet;
    }
     @ManyToOne
    public CompraCab getCompracab() {
        return compracab;
    }

    public void setCompracab(CompraCab compracab) {
        this.compracab = compracab;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId_compradet() {
        return id_compradet;
    }

    public void setId_compradet(int id_compradet) {
        this.id_compradet = id_compradet;
    }

    public long getImporte() {
        return importe;
    }

    public void setImporte(long importe) {
        this.importe = importe;
    }
   
}
