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
public class CDTs extends Fecha{
    private double montoInversion;
    private int porcentajeInteresPagado;
    private double pagoMensual;

    public CDTs(double montoInversion, int porcentajeInteresPagado, double pagoMensual, Date fecha) {
        super(fecha);
        this.montoInversion = montoInversion;
        this.porcentajeInteresPagado = porcentajeInteresPagado;
        this.pagoMensual = pagoMensual;
    }
    
    
    
}
