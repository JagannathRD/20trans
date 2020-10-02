import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-vote',
  templateUrl: './vote.component.html',
  styleUrls: ['./vote.component.css']
})
export class VoteComponent implements OnInit {

  kodachadriCount=0;
  puriCount=0;

  constructor() { }

  ngOnInit(): void {
  }

  onVote(place){
  console.log('invoked vote from parent');
  console.log(place)
  if (place === 'Kodachadri') {
    this.kodachadriCount++;
    console.log(this.kodachadriCount);
    
  }
  if (place === 'Puri') {
    this.puriCount++;
    console.log(this.puriCount);
  }
  }
  
}
