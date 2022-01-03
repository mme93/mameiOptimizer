import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { CarCreatePageRoutingModule } from './car-create-routing.module';

import { CarCreatePage } from './car-create.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    CarCreatePageRoutingModule
  ],
  declarations: [CarCreatePage]
})
export class CarCreatePageModule {}
