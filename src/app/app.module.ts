import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { MainMenuComponent } from './main-menu/main-menu.component';
import { UsersComponent } from './main-menu/users/users.component';
import {AgGridModule } from 'ag-grid-angular';
import { AddusersComponent } from './main-menu/users/addusers/addusers.component';
import { CustomersComponent } from './main-menu/customers/customers.component';
import { AddcustomersComponent } from './main-menu/customers/addcustomers/addcustomers.component';
import { DriversComponent } from './main-menu/drivers/drivers.component';
import { AdddriversComponent } from './main-menu/drivers/adddrivers/adddrivers.component';
import { ViewuserComponent } from './main-menu/users/viewuser/viewuser.component';
import { ViewcustomersComponent } from './main-menu/customers/viewcustomers/viewcustomers.component';
import { ViewdriversComponent } from './main-menu/drivers/viewdrivers/viewdrivers.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    SidebarComponent,
    MainMenuComponent,
    UsersComponent,
    AddusersComponent,
    CustomersComponent,
    AddcustomersComponent,
    DriversComponent,
    AdddriversComponent,
    ViewuserComponent,
    ViewcustomersComponent,
    ViewdriversComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    AgGridModule.withComponents([])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
