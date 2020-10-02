import { Component, OnInit } from '@angular/core';
import {FormControl} from '@angular/forms'

@Component({
  selector: 'app-lpg',
  templateUrl: './lpg.component.html',
  styleUrls: ['./lpg.component.css']
})
export class LpgComponent implements OnInit {


consumerNo: FormControl= new FormControl();
firstName: FormControl= new FormControl();
lastName: FormControl= new FormControl();

  constructor() { }

  ngOnInit(): void {
    this.consumerNo.valueChanges.subscribe(data =>{
      console.log(data);
    
    })
  }

  generateConsumerNo(){
    console.log('consumer no');
    this.consumerNo.setValue(100);
  }

}
