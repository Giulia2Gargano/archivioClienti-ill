/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiillserver.service.impl;

import it.sirfin.archivioClientiillserver.dto.ListaClienti;
import it.sirfin.archivioClientiillserver.model.Cliente;
import it.sirfin.archivioClientiillserver.repository.ArchivioClientiRepository;
import it.sirfin.archivioClientiillserver.service.ArchivioClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArchivioClientiServiceImpl implements ArchivioClientiService{

    @Autowired
    ArchivioClientiRepository archivioClientiRepository;

    @Override
    public ListaClienti aggiungi(Cliente cli) {
        archivioClientiRepository.save(cli);
        return new ListaClienti();
    }
}
