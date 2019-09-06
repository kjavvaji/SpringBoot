import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-viewcustomers',
  templateUrl: './viewcustomers.component.html',
  styleUrls: ['./viewcustomers.component.css']
})
export class ViewcustomersComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  columnDefs = [
    {headerName: 'CustomerId', field: 'customerId' },
    {headerName: 'EmailId', field: 'emailId' },
    {headerName: 'FirstName', field: 'firstName'},
    {headerName: 'LastName', field: 'lastName'},
    {headerName: 'Phone', field: 'phone'}
];
rowData = [
    { customerId: 'Customer1', emailId: 'C1@gmail.com', firstName: 'First' , lastName: 'Person', phone: '+1234567199'},
    { customerId: 'Customer2', emailId: 'C2@gmail.com', firstName: 'Second' , lastName: 'Person', phone: '+1234567299'},
    { customerId: 'Customer3', emailId: 'C3@gmail.com', firstName: 'Third' , lastName: 'Person', phone: '+1234567300'},
    { customerId: 'Customer4', emailId: 'C4@gmail.com', firstName: 'Fourth' , lastName: 'Person', phone: '+1234567477'},
    { customerId: 'Customer5', emailId: 'C5@gmail.com', firstName: 'Fifth' , lastName: 'Person', phone: '+1234567588'},
];
}
