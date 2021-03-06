import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteDto } from './cliente-dto';
import { ListaClientiDto } from './lista-clienti-dto';
import { RicercaDto } from './ricerca-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  cliente = new Cliente();
  clienti: Cliente[] = [];
  search = "";
  stato = "";
  contenitore = new Cliente();

  constructor(private http: HttpClient) { }

  aggiungi() {
    let dto = new ClienteDto();
    dto.cliente = this.cliente;
    this.http.post<ListaClientiDto>("http://localhost:8080/aggiungi", dto)
      .subscribe(r =>
        this.clienti = r.listaClienti
      );
    this.cliente = new Cliente();
    this.search = "";
  }

  ricerca() {
    let ric = new RicercaDto();
    ric.ricerca = this.search;
    this.http.post<ListaClientiDto>("http://localhost:8080/ricerca", ric)
      .subscribe(r =>
        this.clienti = r.listaClienti
      );
  }

  aggiorna() {
    let ric = new RicercaDto();
    ric.ricerca = this.search;
    this.http.post<ListaClientiDto>("http://localhost:8080/aggiorna", ric)
      .subscribe(r => this.clienti = r.listaClienti);
  }

  rimuovi(c: Cliente) {
    let rim = new ClienteDto();
    rim.cliente = c;
    this.http.post<ListaClientiDto>("http://localhost:8080/rimuovi", rim)
      .subscribe(r =>
        this.clienti = r.listaClienti);
  }

  seleziona(c: Cliente) {
    this.stato = "confan";
    let dto = new ClienteDto();
    dto.cliente = c;
    this.http.post<ClienteDto>("http://localhost:8080/seleziona", dto)
      .subscribe(r => this.cliente = r.cliente)
  }

  conferma() {
    this.stato = "";
    let dto = new ClienteDto();
    dto.cliente = this.cliente;
    this.http.post<ListaClientiDto>("http://localhost:8080/confan", dto)
      .subscribe(r => this.clienti = r.listaClienti)
    this.cliente = new Cliente();
  }
  annulla() {
    this.stato = "";
    this.cliente = new Cliente();
  }
}
