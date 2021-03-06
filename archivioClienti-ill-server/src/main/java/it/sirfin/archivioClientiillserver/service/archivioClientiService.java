/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiillserver.service;

import it.sirfin.archivioClientiillserver.dto.ListaClienti;
import it.sirfin.archivioClientiillserver.model.Cliente;
import java.util.List;

public interface ArchivioClientiService {

    ListaClienti aggiungi(Cliente cli);

    ListaClienti aggiorna();
}
