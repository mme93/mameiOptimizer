import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { TasktoolPageRoutingModule } from './tasktool-routing.module';

import { TasktoolPage } from './tasktool.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    TasktoolPageRoutingModule
  ],
  declarations: [TasktoolPage]
})
export class TasktoolPageModule {}
