/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiillserver.dto;

import it.sirfin.archivioClientiillserver.model.Cliente;
import java.util.List;

/**
 *
 * @author Palo
 */
public class ListaClienti {

    private List<Cliente> listaClienti;

    public ListaClienti() {
    }

    public ListaClienti(List<Cliente> listaClienti) {
        this.listaClienti = listaClienti;
    }

    public List<Cliente> getListaClienti() {
        return listaClienti;
    }

    public void setListaClienti(List<Cliente> listaClienti) {
        this.listaClienti = listaClienti;
    }

    @Override
    public String toString() {
        return "ListaClienti{" + "listaClienti=" + listaClienti + '}';
    }

}
