/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiillserver.service;

import it.sirfin.archivioClientiillserver.dto.ClienteDto;
import it.sirfin.archivioClientiillserver.dto.ListaClienti;
import it.sirfin.archivioClientiillserver.model.Cliente;
import org.springframework.web.bind.annotation.RequestBody;

public interface ArchivioClientiService {

    ListaClienti aggiungi(Cliente cli);

    ListaClienti aggiorna();

    ListaClienti aggiornaFiltrato(String ricerca);

    ListaClienti rimuovi(Cliente rim);

    ListaClienti ricerca(String ricerca);

    ListaClienti confan(Cliente cli);

    ClienteDto seleziona(Cliente dto);
}
