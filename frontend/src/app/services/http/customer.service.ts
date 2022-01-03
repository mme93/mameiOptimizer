import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../../models/Customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {


  constructor(private http: HttpClient) {
  }

  getCustomer(sign: string): Observable<Customer> {
    return this.http.get<Customer>('http://localhost:8093/customer/' + Object.values(sign)[0]);
  }

  getAllCustomer(): Observable<Customer[]> {
    return this.http.get<Customer[]>('http://localhost:8093/customer/');
  }

  deleteCustomer(email: string) {
    this.http.delete('http://localhost:8093/customer/delete/' + email).subscribe(
      response => {
        console.log(response);
      }, error => {
        console.log(error);
      });
  }

  updateCustomer(customer: Customer) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    this.http.put('http://localhost:8093/customer/update', JSON.stringify(customer), httpOptions).subscribe(
      response => {
        console.log(response);
      }, error => {
        console.log(error);
      }
    );
  }

  saveCustomer(customer: Customer) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    this.http.post('http://localhost:8093/customer/save', JSON.stringify(customer), httpOptions).subscribe(
      response => {
        console.log(response);
      }, error => {
        console.log(error);
      }
    );
  }
}
