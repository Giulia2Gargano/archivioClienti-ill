/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiillserver.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String codice;
    @Column
    private String ragioneSociale;
    @Column
    private String indirizzo;

    public Cliente() {
    }

    public Cliente(String codice, String ragioneSociale, String indirizzo) {
        this.codice = codice;
        this.ragioneSociale = ragioneSociale;
        this.indirizzo = indirizzo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", codice=" + codice + ", ragioneSociale=" + ragioneSociale + ", indirizzo=" + indirizzo + '}';
    }

}
