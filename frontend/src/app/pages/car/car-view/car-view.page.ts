import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {CarService} from '../../../services/http/car.service';
import {Car} from '../../../models/Car';

@Component({
  selector: 'app-car-view',
  templateUrl: './car-view.page.html',
  styleUrls: ['./car-view.page.scss'],
})
export class CarViewPage implements OnInit {

  car: Car= new Car();
  constructor(private route: ActivatedRoute,private carService: CarService) { }

  ngOnInit() {
    this.route.queryParams.subscribe((params) => {
      this.carService.getCar(params.KZ).subscribe(car =>{
        this.car=car;
      });
    });
  }

}
