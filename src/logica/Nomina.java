/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author Shonny
 */
public class Nomina extends Cuenta{
    private String nombreEmpresa;

    public Nomina(String nombreEmpresa, String numeroBancario, Date fecha) {
        super(numeroBancario, fecha);
        this.nombreEmpresa = nombreEmpresa;
    }
    
    
    
}
