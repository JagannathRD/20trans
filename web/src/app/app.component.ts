import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'web';
  enableA=false;
  enableC=false;
  enableR=false;
  disable=false;

  constructor(){
    console.log('App component')
      }

enableAbout(){
  this.enableA= true;
  this.enableC=false;
  this.enableR=false;

}
enableCourse(){
  this.enableC=true;
  this.enableR=false;
  this.enableA= false;

}enableReview(){
  this.enableR=true;
  this.enableA= false;
  this.enableC=false;
}

}
