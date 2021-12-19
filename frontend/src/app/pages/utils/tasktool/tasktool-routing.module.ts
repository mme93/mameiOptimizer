import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { TasktoolPage } from './tasktool.page';

const routes: Routes = [
  {
    path: '',
    component: TasktoolPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class TasktoolPageRoutingModule {}
