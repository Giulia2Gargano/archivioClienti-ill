/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiillserver.controller;

import it.sirfin.archivioClientiillserver.dto.ClienteDto;
import it.sirfin.archivioClientiillserver.dto.ListaClienti;
import it.sirfin.archivioClientiillserver.dto.RicercaDto;
import it.sirfin.archivioClientiillserver.service.ArchivioClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ArchivioClientiController {

    @Autowired
    ArchivioClientiService archivioClientiService;

    @RequestMapping("/aggiungi")
    @ResponseBody
    public ListaClienti aggiungi(@RequestBody ClienteDto dto) {
        return archivioClientiService.aggiungi(dto.getCliente());
    }

    @RequestMapping("/aggiorna")
    @ResponseBody
    public ListaClienti aggiorna() {
        return archivioClientiService.aggiorna();
    }
    
    @RequestMapping ("/rimuovi")
    @ResponseBody
    public ListaClienti rimuovi(@RequestBody ClienteDto rim) {
       return archivioClientiService.rimuovi(rim.getCliente());
    }
    
    @RequestMapping ("/ricerca")
    @ResponseBody
    public ListaClienti ricerca(@RequestBody RicercaDto stringa) {
     return archivioClientiService.ricerca(stringa.getRicerca());
    }
}
