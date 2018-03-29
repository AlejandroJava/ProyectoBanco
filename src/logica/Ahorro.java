/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author Shonny, alejandro
 */
public class Ahorro extends Cuenta{
    private Date fechaRetiroAhorros;

    public Ahorro(Date fechaRetiroAhorros, String numeroBancario, Date fecha) {
        super(numeroBancario, fecha);
        this.fechaRetiroAhorros = fechaRetiroAhorros;
    }
    
    
}
