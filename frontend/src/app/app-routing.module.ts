import {NgModule} from '@angular/core';
import {PreloadAllModules, RouterModule, Routes} from '@angular/router';

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
    loadChildren: () => import('./pages/settings/settings.module').then(m => m.SettingsPageModule)
  },
  {
    path: 'task',
    loadChildren: () => import('./pages/utils/task/task.module').then(m => m.TaskPageModule)
  },
  {
    path: 'tasktool',
    loadChildren: () => import('./pages/utils/tasktool/tasktool.module').then(m => m.TasktoolPageModule)
  },
  {
    path: 'customer-create',
    loadChildren: () => import('./pages/person/customer-create/customer-create.module').then(m => m.CustomerCreatePageModule)
  },
  {
    path: 'customer-view',
    loadChildren: () => import('./pages/person/customer-view/customer-view.module').then(m => m.CustomerViewPageModule)
  },
  {
    path: 'car-create',
    loadChildren: () => import('./pages/car/car-create/car-create.module').then(m => m.CarCreatePageModule)
  },
  {
    path: 'car',
    loadChildren: () => import('./pages/car/car/car.module').then(m => m.CarPageModule)
  },
  {
    path: 'car-view',
    loadChildren: () => import('./pages/car/car-view/car-view.module').then(m => m.CarViewPageModule)
  },
  {
    path: 'order',
    loadChildren: () => import('./pages/order/order/order.module').then(m => m.OrderPageModule)
  },
  {
    path: 'order-create',
    loadChildren: () => import('./pages/order/order-create/order-create.module').then(m => m.OrderCreatePageModule)
  },
  {
    path: 'order-view',
    loadChildren: () => import('./pages/order/order-view/order-view.module').then(m => m.OrderViewPageModule)
  },
  {
    path: '**',
    // eslint-disable-next-line max-len
    loadChildren: () => import('./pages/error/pagenotfoundcomponent/pagenotfoundcomponent.module').then(m => m.PagenotfoundcomponentPageModule)
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, {preloadingStrategy: PreloadAllModules})
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
