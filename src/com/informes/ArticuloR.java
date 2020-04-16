/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.informes;

import com.entidad.Tipo;





/**
 *
 * @author fdbritez
 */

public class ArticuloR {
 
    private int id_articulo;
    private String des_articulo;
    private int p_venta;
    private int cantidad;
   // private String id_tipo;
    private String des_tipo;

   

    
    

    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDes_articulo() {
        return des_articulo;
    }

    public void setDes_articulo(String des_articulo) {
        this.des_articulo = des_articulo;
    }

    public String getDes_tipo() {
        return des_tipo;
    }

    public void setDes_tipo(String des_tipo) {
        this.des_tipo = des_tipo;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public int getP_venta() {
        return p_venta;
    }

    public void setP_venta(int p_venta) {
        this.p_venta = p_venta;
    }

   

    public ArticuloR(int id_articulo,String des_articulo,String des_tipo,int p_venta,int cantidad) {
        this.id_articulo= id_articulo;
        this.des_articulo= des_articulo;
        this.des_tipo= des_tipo;
        this.p_venta= p_venta;
        this.cantidad=cantidad;
        
       
    }

   

  

    
}
