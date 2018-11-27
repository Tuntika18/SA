import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {
  public API = '//localhost:8080';
  
  constructor(private http: HttpClient) {}

  getInitials(): Observable<any> {
    return this.http.get(this.API + '/Initial-list');
  }
  getGenders(): Observable<any> {
    return this.http.get(this.API + '/Gender-list');
  }
  getProvinces(): Observable<any> {
    return this.http.get(this.API + '/Province-list');
  }
  // getInitialDetail(name): Observable<any> {
  //   return this.http.get(this.API + '/customers/getById/' + name);
  // }
  // getServiceDetail(service): Observable<any> {
  //   return this.http.get(this.API + '/messenger/services/getById/' + service);
  // }
  // getProvinceDetail(area): Observable<any> {
  //   return this.http.get(this.API + '/province/getById/' + area);
  // }

}
