import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { PagenotfoundcomponentPageRoutingModule } from './pagenotfoundcomponent-routing.module';

import { PagenotfoundcomponentPage } from './pagenotfoundcomponent.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    PagenotfoundcomponentPageRoutingModule
  ],
  declarations: [PagenotfoundcomponentPage]
})
export class PagenotfoundcomponentPageModule {}
