import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsersComponent } from './main-menu/users/users.component';
import { AddusersComponent } from './main-menu/users/addusers/addusers.component';
import { MainMenuComponent } from './main-menu/main-menu.component';


const routes: Routes = [
  {path: '', component: MainMenuComponent},
  {path: 'users', component: UsersComponent},
  {path: 'addusers', component: AddusersComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
