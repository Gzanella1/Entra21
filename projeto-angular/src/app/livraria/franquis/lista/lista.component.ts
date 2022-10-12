import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent implements OnInit {

  listaFranquias: Fraquia[]=[];
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  this.http.get<Franquias[]>subscribe(franquias => 
  this.listaFranquias.push(franquias)){

    }
  }


}
