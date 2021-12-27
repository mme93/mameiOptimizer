import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { CustomerSettingsPageRoutingModule } from './customer-settings-routing.module';

import { CustomerSettingsPage } from './customer-settings.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    CustomerSettingsPageRoutingModule
  ],
  declarations: [CustomerSettingsPage]
})
export class CustomerSettingsPageModule {}
