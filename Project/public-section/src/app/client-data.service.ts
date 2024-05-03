import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {  map, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientDataService {

  constructor(private http: HttpClient) {}
  getAllData(data: any): Observable<any> {
    const   headers = new HttpHeaders({
      'Content-Type': 'application/json'
    }); 
    return this.http.post<any>('http://localhost:8089/api/client',  data,{headers});
  }
}
