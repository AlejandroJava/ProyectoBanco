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
public class Cuenta extends FechaCreacion{
    private String numeroBancario;

    public Cuenta(String numeroBancario, Date fecha) {
        super(fecha);
        this.numeroBancario = numeroBancario;
    }
    
    
    
}
