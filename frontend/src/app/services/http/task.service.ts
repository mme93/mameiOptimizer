import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {MainTask} from '../../models/MainTask';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private http: HttpClient) { }

  getAllMainTask(): Observable<MainTask[]>{
    return this.http.get<MainTask[]>('http://localhost:8093/mainTask');
  }
}
