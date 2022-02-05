import {Component, OnInit} from '@angular/core';
import {Car} from '../../../models/Car';

@Component({
  selector: 'app-car-create',
  templateUrl: './car-create.page.html',
  styleUrls: ['./car-create.page.scss'],
})
export class CarCreatePage implements OnInit {

  car: Car;
  constructor() {
  }


  ngOnInit() {
    this.car = new Car();
  }

  saveCar() {
    return null;
  }

  saveFile() {
    return null;
  }

  openFileLoader() {
    return null;
  }

  refreshCar() {
    return null;
  }
}
