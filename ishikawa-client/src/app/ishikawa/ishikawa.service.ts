import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Ishikawa } from '../models/ishikawa.model';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class IshikawaService {

  constructor(private http:HttpClient) {}

  private ishikawaUrl = 'http://localhost:8080/ishikawa';
	//private ishikawaUrl = '/api';

  public getIshikawas() {
    return this.http.get<Ishikawa[]>(this.ishikawaUrl);
  }

  public deleteIshikawa(ishikawa) {
    return this.http.delete(this.ishikawaUrl + "/"+ ishikawa.id);
  }

  public createIshikawa(ishikawa) {
    return this.http.post<Ishikawa>(this.ishikawaUrl, ishikawa);
  }

}
