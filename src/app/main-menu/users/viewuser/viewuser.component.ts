import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-viewuser',
  templateUrl: './viewuser.component.html',
  styleUrls: ['./viewuser.component.css']
})
export class ViewuserComponent implements OnInit {
 
  constructor() { }

  ngOnInit() {
  }

  columnDefs = [
    {headerName: 'UserId', field: 'userId' },
    {headerName: 'EmailId', field: 'emailId' },
    {headerName: 'FirstName', field: 'firstName'},
    {headerName: 'LastName', field: 'lastName'},
    {headerName: 'Phone', field: 'phone'}
];

rowData = [
    { userId: 'fpuser', emailId: 'fp@gmail.com', firstName: 'First' , lastName: 'Person', phone: '912345671'},
    { userId: 'spuser', emailId: 'sp@gmail.com', firstName: 'Second' , lastName: 'Person', phone: '912345672'},
    { userId: 'tpuser', emailId: 'tp@gmail.com', firstName: 'Third' , lastName: 'Person', phone: '912345673'},
    { userId: 'fopuser', emailId: 'fop@gmail.com', firstName: 'Fourth' , lastName: 'Person', phone: '912345674'},
    { userId: 'fipuser', emailId: 'fip@gmail.com', firstName: 'Fifth' , lastName: 'Person', phone: '912345675'},
];
}


