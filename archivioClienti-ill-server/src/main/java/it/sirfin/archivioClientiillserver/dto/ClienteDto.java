/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiillserver.dto;

import it.sirfin.archivioClientiillserver.model.Cliente;

public class ClienteDto {

    private Cliente cliente;

    public ClienteDto(Cliente cliente) {
        this.cliente = cliente;
    }

    public ClienteDto() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "InserimentoDto{" + "cliente=" + cliente + '}';
    }

}
