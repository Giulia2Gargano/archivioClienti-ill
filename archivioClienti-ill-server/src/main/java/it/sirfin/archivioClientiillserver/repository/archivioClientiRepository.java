/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiillserver.repository;

import it.sirfin.archivioClientiillserver.model.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchivioClientiRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByCodiceContainsOrRagioneSocialeContainsOrIndirizzoContains(String c, String r, String i);
}
