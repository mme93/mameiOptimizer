import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Brand} from '../../models/Brand';
import {CarType} from '../../models/CarType';
import {Customer} from '../../models/Customer';
import {Car} from '../../models/Car';

@Injectable({
  providedIn: 'root'
})
export class CarService {

  constructor(private http: HttpClient) {
  }

  getAllCarTypes(): Observable<CarType[]> {
    return this.http.get<CarType[]>('http://localhost:8093/car/carType/');
  }

  getAllBrands(): Observable<Brand[]> {
    return this.http.get<Brand[]>('http://localhost:8093/car/brand/');
  }

  getAllCustomer(): Observable<Customer[]> {
    return this.http.get<Customer[]>('http://localhost:8093/customer/');
  }

  saveCar(car: Car) {
    //this.http.post('http://localhost:8093/')
  }
}
