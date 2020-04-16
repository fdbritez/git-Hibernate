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
public class Tipo implements Serializable {
    private List<Articulo> articulos = new ArrayList<>();
    private int id_tipo;
    private String des_tipo;
    
    @Column(length = 50)
    public String getDes_tipo(){
      return des_tipo;   
    }
    public void setDes_tipo(String des_tipo){
        this.des_tipo =des_tipo;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId_tipo(){
        return id_tipo;
    }
    public void setId_tipo(int id_tipo){
        this.id_tipo=id_tipo;
    }
   
    @OneToMany(mappedBy ="tipo",cascade=CascadeType.ALL)
    public List<Articulo> getArticulos(){
        return articulos;
    }
    public void setArticulos(List<Articulo> articulos){
        this.articulos = articulos;
    }
    
    
}
