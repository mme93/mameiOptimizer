import {Component, OnInit} from '@angular/core';
import {Car} from '../../../models/Car';
import {CarService} from '../../../services/http/car.service';
import {CarType} from '../../../models/CarType';
import {Brand} from '../../../models/Brand';
import {Customer} from '../../../models/Customer';

@Component({
  selector: 'app-car-create',
  templateUrl: './car-create.page.html',
  styleUrls: ['./car-create.page.scss'],
})
export class CarCreatePage implements OnInit {
  path: string;
  car: Car;
  carTypes: CarType[] = [];
  brands: Brand[] = [];
  fuels: string[] = [];
  gears: string[] = [];
  customers: Customer[] = [];

  constructor(private carService: CarService) {
  }


  ngOnInit() {
    this.car = new Car();
    this.initData();
  }


  saveCar() {
    this.carService.saveCar(this.car);
  }

  saveFile() {
    if (this.path.length === 0 || this.path == null) {
      alert('Bitte Pfad eingeben');
      return;
    }
    return null;
  }


  refreshCar() {
    this.car = new Car();
  }

  initData() {
    this.carService.getAllCarTypes().forEach(carTypeList => {
      carTypeList.forEach(carType => {
        this.carTypes.push(carType);
      });
    });
    this.carService.getAllBrands().forEach(brandList => {
      brandList.forEach(brand => {
        this.brands.push(brand);
      });
    });
    this.carService.getAllCustomer().forEach(customerList => {
      customerList.forEach(customer => {
        this.customers.push(customer);
      });
    });
    this.fuels.push('Benzin');
    this.fuels.push('Elektro');
    this.fuels.push('Diesel');

    this.gears.push('Schaltgetriebe');
    this.gears.push('Automatikgetriebe');
    this.path='';
  }
}
