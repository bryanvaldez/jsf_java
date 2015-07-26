/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfjava.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author alumno
 */
@ManagedBean
@RequestScoped
public class TestBean {

    private String comentarios;

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String grabar() {
        System.out.println("grabando: " + comentarios);
        return "test";
    }
}
