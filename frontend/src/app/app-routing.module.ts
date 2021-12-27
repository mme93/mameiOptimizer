import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./pages/home/home.module').then(m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'login',
    loadChildren: () => import('./pages/login/login.module').then(m => m.LoginPageModule)
  },
  {
    path: 'customer',
    loadChildren: () => import('./pages/person/customer/customer.module').then(m => m.CustomerPageModule)
  },
  {
    path: 'settings',
    loadChildren: () => import('./pages/settings/settings.module').then( m => m.SettingsPageModule)
  },
  {
    path: 'task',
    loadChildren: () => import('./pages/utils/task/task.module').then(m => m.TaskPageModule)
  },
  {
    path: 'tasktool',
    loadChildren: () => import('./pages/utils/tasktool/tasktool.module').then( m => m.TasktoolPageModule)
  },
  {
    path: 'customer-create',
    loadChildren: () => import('./pages/person/customer-create/customer-create.module').then( m => m.CustomerCreatePageModule)
  },
  {
    path: 'customer-view',
    loadChildren: () => import('./pages/person/customer-view/customer-view.module').then( m => m.CustomerViewPageModule)
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
