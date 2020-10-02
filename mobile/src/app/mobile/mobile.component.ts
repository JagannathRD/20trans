import {Component,Input} from '@angular/core'
@Component({
    selector:'app-mobile',
    templateUrl:'mobile.component.html'
})

export class MobileComponent{

    brand=['MI', 'Samsung', 'Apple'];
    color=['White','Black','Blue','Red'];
    avail=['Yes','No','Pre-order'];
    price=2500;
    imageSrc='assets/Emo_Love.jpg'
  @Input("made")
  madeIn;

  book=false;

    constructor(){
        console.log('Mobile component..')
    }

    clickMe(){
        console.log('Booked');
        this.book=true;
    }
}