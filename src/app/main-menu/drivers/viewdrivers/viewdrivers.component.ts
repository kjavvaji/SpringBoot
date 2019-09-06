import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-viewdrivers',
  templateUrl: './viewdrivers.component.html',
  styleUrls: ['./viewdrivers.component.css']
})
export class ViewdriversComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  columnDefs = [
    {headerName: 'DriverId', field: 'driverId' },
    {headerName: 'EmailId', field: 'emailId' },
    {headerName: 'FirstName', field: 'firstName'},
    {headerName: 'LastName', field: 'lastName'},
    {headerName: 'Phone', field: 'phone'}
];

rowData = [
    { driverId: 'Driver1', emailId: 'D1@gmail.com', firstName: 'First' , lastName: 'Person', phone: '+1234567199'},
    { driverId: 'Driver2', emailId: 'D2@gmail.com', firstName: 'Second' , lastName: 'Person', phone: '+1234567299'},
    { driverId: 'Driver3', emailId: 'D3@gmail.com', firstName: 'Third' , lastName: 'Person', phone: '+1234567300'},
    { driverId: 'Driver4', emailId: 'D4@gmail.com', firstName: 'Fourth' , lastName: 'Person', phone: '+1234567477'},
    { driverId: 'Driver5', emailId: 'D5@gmail.com', firstName: 'Fifth' , lastName: 'Person', phone: '+1234567588'},
];
}
