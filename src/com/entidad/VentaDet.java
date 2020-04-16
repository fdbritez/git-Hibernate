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
public class VentaDet implements Serializable {
   private int num;
   private int cantidad_vtadet;
   private int importe;
   private Articulo articulo;
   private VentaCab ventaCab;

    @ManyToOne
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad_vtadet() {
        return cantidad_vtadet;
    }

    public void setCantidad_vtadet(int cantidad_vtadet) {
        this.cantidad_vtadet = cantidad_vtadet;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
     @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    @ManyToOne
    public VentaCab getVentaCab() {
        return ventaCab;
    }

    public void setVentaCab(VentaCab ventaCab) {
        this.ventaCab = ventaCab;
    }
}
