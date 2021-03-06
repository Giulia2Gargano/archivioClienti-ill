import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteDto } from './cliente-dto';
import { ListaClientiDto } from './lista-clienti-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  cliente = new Cliente();
  clienti: Cliente[] = [];
  search = "";

  constructor(private http: HttpClient) { }

  aggiungi() {
    let dto = new ClienteDto();
    dto.cliente = this.cliente;
    this.http.post<ListaClientiDto>("http://localhost:8080/aggiungi", dto)
      .subscribe(r =>
        this.clienti = r.listaClienti
      );
  }

  ricerca() {

  }

  aggiorna() {

  }

  rimuovi() {

  }

  seleziona() {

  }
}
