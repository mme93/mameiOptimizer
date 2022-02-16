import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { CalendarViewPageRoutingModule } from './calendar-view-routing.module';

import { CalendarViewPage } from './calendar-view.page';
import { NgCalendarModule } from 'ionic2-calendar';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    CalendarViewPageRoutingModule,
    NgCalendarModule

  ],
  declarations: [CalendarViewPage]
})
export class CalendarViewPageModule {}
