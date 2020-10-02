import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-captain',
  templateUrl: './captain.component.html',
  styleUrls: ['./captain.component.css']
})
export class CaptainComponent implements OnInit {

  captainForm= new FormGroup({
    name: new FormControl(''),
    team: new FormControl(''),
    location: new FormControl('')
  }) 

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(){
    console.log(this.captainForm.value)
  }

}
