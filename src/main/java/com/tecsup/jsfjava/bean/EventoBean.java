package com.tecsup.jsfjava.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class EventoBean {
    
    private String codigo;
    private String[] horario;
    private String transporte;
    private String comentarios;
    private String informacion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String[] getHorario() {
        return horario;
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    public void enviar() {
        System.out.println("Sexo: " + sexo);
        System.out.println("Total Sistemas: " + sisop.length);
        if (clave.equals(clave2)) {
            claveMensaje = "Las claves sí coinciden";
        } else {
            claveMensaje = "Las claves no coinciden";
        }
    }    
    
}
