import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CarCreatePage } from './car-create.page';

const routes: Routes = [
  {
    path: '',
    component: CarCreatePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CarCreatePageRoutingModule {}
