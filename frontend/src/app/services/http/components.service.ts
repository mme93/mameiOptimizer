import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Components} from '../../models/Components';

@Injectable({
  providedIn: 'root'
})
export class ComponentsService {

  constructor(private http: HttpClient) { }

  getAllComponents(): Observable<Components[]>{
    return this.http.get<Components[]>('http://localhost:8093/components');
  }
}

