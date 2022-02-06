import {Component, OnInit} from '@angular/core';
import {CarService} from '../../../services/http/car.service';
import {Car} from '../../../models/Car';
import {Router} from '@angular/router';

@Component({
  selector: 'app-car',
  templateUrl: './car.page.html',
  styleUrls: ['./car.page.scss'],
})
export class CarPage implements OnInit {

  cars: Car[] = [];

  constructor(private carService: CarService, private router: Router) {
  }

  ngOnInit() {
    this.loadCarList();
  }

  loadCarList() {
    this.carService.getAllCars().forEach(carArray => {
      carArray.forEach(car => this.cars.push(car));
    });
  }

  loadCar(car: Car) {
    // eslint-disable-next-line @typescript-eslint/naming-convention
    this.router.navigate(['car-view'], {queryParams: {KZ: car.licensePlate}});
  }
}
