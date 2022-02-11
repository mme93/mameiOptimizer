import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PagenotfoundcomponentPage } from './pagenotfoundcomponent.page';

const routes: Routes = [
  {
    path: '',
    component: PagenotfoundcomponentPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class PagenotfoundcomponentPageRoutingModule {}
