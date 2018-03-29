/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Enumeracion.Permiso;
import java.util.Date;

/**
 *
 * @author Shonny
 */
public class Cliente extends Usuario{
    private String nombres;
    private String apellidos;
    private String cedula;
    private int edad;
    private String sexo;
    private String email;
    private Date fechaCumpleanios;

    public Cliente(String nombres, String apellidos, String cedula, String sexo, String email, Date fechaCumpleanios, String usuario, String password, String preguntaSeguridad, String respuesta, Permiso permisos) {
        super(usuario, password, preguntaSeguridad, respuesta, permisos);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        //this.edad = edad;// ojo calcular la edad
        this.sexo = sexo;
        this.email = email;
        this.fechaCumpleanios = fechaCumpleanios;
    }

    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaCumpleanios() {
        return fechaCumpleanios;
    }

    public void setFechaCumpleanios(Date fechaCumpleanios) {
        this.fechaCumpleanios = fechaCumpleanios;
    }
    
    
    
}
