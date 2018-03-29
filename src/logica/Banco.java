/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Shonny, alejandro
 */
public class Banco {

    private ArrayList<Cliente> clientes;
    private ArrayList<Empresa> empresas;

    public Banco() {
        this.clientes = new ArrayList<Cliente>();
        this.empresas = new ArrayList<Empresa>();
    }

    public Cliente buscarCliente(String id) {
        for (Cliente cliente : clientes) {
            if (id.equals(cliente.getCedula())) {
                return cliente;
            }
        }
        return null;
    }
//    public Cliente buscarCliente(String id) {
//        for (int i = 0; i < clientes.size(); i++) {
//            Cliente partido = clientes.get(i);
//            if (id.equals(partido.getCedula())) {
//                return partido;
//            }
//        }
//        return null;
//    }

    public boolean agregarCliente(Cliente client) {
        String ident = client.getCedula();

        Cliente verificar = buscarCliente(ident);
        if (verificar == null) {
            clientes.add(client);
            return true;
        } else {
            return false;
        }
    }
    

    public Empresa buscarEmpresa(String nit) {
        for (Empresa empresa : empresas) {
            if (nit.equals(empresa.getNIT())) {
                return empresa;
            }
        }
        return null;
    }

    public boolean agregarEmpresa(Empresa empre) {
        String nit = empre.getNIT();

        Empresa verificar = buscarEmpresa(nit);
        if (verificar == null) {
            empresas.add(empre);
            return true;
        } else {
            return false;
        }
    }

}
