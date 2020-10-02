import { Component, OnInit,Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-place',
  templateUrl: './place.component.html',
  styleUrls: ['./place.component.css']
})
export class PlaceComponent implements OnInit {

  @Input('vname')
  voterName='NA';

  @Output()
  place:EventEmitter<string>=new EventEmitter();

  disableButton=false;

  constructor() { }

  ngOnInit(): void {
  }

  onPress(place:string){
    console.log('invoked onPress in place component');
    this.disableButton=true;
    console.log(place)
    this.place.emit(place);
  }

}
