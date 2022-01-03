import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { CarViewPageRoutingModule } from './car-view-routing.module';

import { CarViewPage } from './car-view.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    CarViewPageRoutingModule
  ],
  declarations: [CarViewPage]
})
export class CarViewPageModule {}
