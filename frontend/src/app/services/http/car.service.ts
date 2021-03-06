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
    return this.http.get<CarType[]>('http://localhost:8093/car/');
  }

  getAllBrands(): Observable<Brand[]> {
    return this.http.get<Brand[]>('http://localhost:8093/car/brand/');
  }

  getAllCustomer(): Observable<Customer[]> {
    return this.http.get<Customer[]>('http://localhost:8093/customer/');
  }
  getAllCars(): Observable<Car[]> {
    return this.http.get<Car[]>('http://localhost:8093/car/');
  }
  getCar(licensPlate: string): Observable<Car>{
    return this.http.get<Car>('http://localhost:8093/car/licensePlate/'+licensPlate);
  }
  saveCar(car: Car) {
    const httpOptions = {
      headers: new HttpHeaders({
        // eslint-disable-next-line @typescript-eslint/naming-convention
        'Content-Type': 'application/json'
      })
    };
    this.http.post('http://localhost:8093/car/save', JSON.stringify(car), httpOptions).subscribe(
      response => {
        console.log(response);
      }, error => {
        console.log(error);
      }
    );
  }
}
