/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Enumeracion.Permiso;

/**
 *
 * @author Shonny
 */
public class Usuario {
    private String usuario;
    private String password;
    private String preguntaSeguridad;
    private String respuesta;
    private Permiso permisos;

    public Usuario(String usuario, String password, String preguntaSeguridad, String respuesta, Permiso permisos) {
        this.usuario = usuario;
        this.password = password;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuesta = respuesta;
        this.permisos = permisos;
    }


    
    
}
