import { Component } from '@angular/core';

@Component({
  selector: 'app-avengers',
  templateUrl: './avengers.component.html',
  styleUrls: ['./avengers.component.css']
})



export class AvengersComponent{
    constructor(){
console.log('From Avengers class');
    }
}