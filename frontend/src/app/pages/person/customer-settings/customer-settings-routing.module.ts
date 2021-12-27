import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CustomerSettingsPage } from './customer-settings.page';

const routes: Routes = [
  {
    path: '',
    component: CustomerSettingsPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CustomerSettingsPageRoutingModule {}
