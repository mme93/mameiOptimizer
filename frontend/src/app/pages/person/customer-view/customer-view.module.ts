import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { CustomerViewPageRoutingModule } from './customer-view-routing.module';

import { CustomerViewPage } from './customer-view.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    CustomerViewPageRoutingModule
  ],
  declarations: [CustomerViewPage]
})
export class CustomerViewPageModule {}
