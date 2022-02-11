import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CalendarViewPage } from './calendar-view.page';

const routes: Routes = [
  {
    path: '',
    component: CalendarViewPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CalendarViewPageRoutingModule {}
