import { Component, OnInit } from '@angular/core';
import { Observable, observable, Subscription } from 'rxjs';

@Component({
  selector: 'app-observable',
  templateUrl: './observable.component.html',
  styleUrls: ['./observable.component.css']
})
export class ObservableComponent implements OnInit {

  packetOfData: Observable<string>;
  displayName:string='';

  constructor() { }

  ngOnInit(): void {
  }
  onStreamData(){
    console.log('invoked on stream');

    this.packetOfData= new Observable(s =>{
      s.next('Jaggu');
      s.next('Somu');
      
     setTimeout(() =>{
     s.next('divya');
     },3000);
    
     setTimeout(() =>{
      s.complete();
      },5000);
    
    });
  }

  onSub1(){
    console.log('invoked onsub1');

  

//sub.unsubscribe();
  }
  onSub2(){
    let sub:Subscription= this.packetOfData.subscribe( data =>{
      console.log('sub1');
     console.log(data);
     this.displayName=data;
    },e =>{

    },() =>{
      console.log('this is complete');
    });
    
  }
}
