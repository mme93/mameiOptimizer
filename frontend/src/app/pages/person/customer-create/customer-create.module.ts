import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { CustomerCreatePageRoutingModule } from './customer-create-routing.module';

import { CustomerCreatePage } from './customer-create.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    CustomerCreatePageRoutingModule
  ],
  declarations: [CustomerCreatePage]
})
export class CustomerCreatePageModule {}
