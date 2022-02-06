import {Component, OnInit} from '@angular/core';
import {CarService} from '../../../services/http/car.service';
import {Car} from '../../../models/Car';

@Component({
  selector: 'app-car',
  templateUrl: './car.page.html',
  styleUrls: ['./car.page.scss'],
})
export class CarPage implements OnInit {

  cars: Car[] = [];

  constructor(private carService: CarService) {
  }

  ngOnInit() {
  }

  loadCar() {
   this.carService.getAllCars().forEach(car =>{
     console.log(car);
   });
  }
}
