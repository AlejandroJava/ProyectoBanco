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
    private Date fechaCumpleaños;

    public Cliente(String nombres, String apellidos, String cedula, int edad, String sexo, String email, Date fechaCumpleaños, String usuario, String password, String preguntaSeguridad, String respuesta, Permiso permisos) {
        super(usuario, password, preguntaSeguridad, respuesta, permisos);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.edad = edad;
        this.sexo = sexo;
        this.email = email;
        this.fechaCumpleaños = fechaCumpleaños;
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
    
    
    
}
