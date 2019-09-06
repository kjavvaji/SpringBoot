import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsersComponent } from './main-menu/users/users.component';
import { AddusersComponent } from './main-menu/users/addusers/addusers.component';
import { MainMenuComponent } from './main-menu/main-menu.component';
import { CustomersComponent } from './main-menu/customers/customers.component';
import { AddcustomersComponent } from './main-menu/customers/addcustomers/addcustomers.component';
import { ViewcustomersComponent } from './main-menu/customers/viewcustomers/viewcustomers.component';
import { DriversComponent } from './main-menu/drivers/drivers.component';
import { AdddriversComponent } from './main-menu/drivers/adddrivers/adddrivers.component';
import { ViewuserComponent } from './main-menu/users/viewuser/viewuser.component';
import { ViewdriversComponent } from './main-menu/drivers/viewdrivers/viewdrivers.component';


const routes: Routes = [
  {path: '', component: MainMenuComponent},
  {path: 'users', component: UsersComponent},
  {path: 'addusers', component: AddusersComponent},
  {path: 'customers', component: CustomersComponent},
  {path: 'addcustomers', component: AddcustomersComponent},
  {path: 'viewcustomers', component: ViewcustomersComponent},
  {path: 'drivers', component: DriversComponent},
  {path: 'adddrivers', component: AdddriversComponent},
  {path: 'viewdrivers', component: ViewdriversComponent},
  {path: 'viewusers', component: ViewuserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
