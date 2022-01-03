import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CarViewPage } from './car-view.page';

const routes: Routes = [
  {
    path: '',
    component: CarViewPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CarViewPageRoutingModule {}
