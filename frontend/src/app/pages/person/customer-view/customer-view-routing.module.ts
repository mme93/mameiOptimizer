import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CustomerViewPage } from './customer-view.page';

const routes: Routes = [
  {
    path: '',
    component: CustomerViewPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CustomerViewPageRoutingModule {}
