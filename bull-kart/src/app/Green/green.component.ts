import {Component} from '@angular/core'

@Component({
    selector:'app-green',
    templateUrl:'green.component.html',
    styleUrls:['green.component.css'],

})


export class GreenComponent{
    constructor(){
    console.log('This is from Green Component');
    }
}