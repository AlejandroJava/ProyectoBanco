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
public class Empresa extends Usuario{
    private String razonSocial;
    private String NIT;

    public Empresa(String razonSocial, String NIT, String usuario, String password, String preguntaSeguridad, String respuesta, Permiso permisos) {
        super(usuario, password, preguntaSeguridad, respuesta, permisos);
        this.razonSocial = razonSocial;
        this.NIT = NIT;
    }


    
    
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
    
    
}
