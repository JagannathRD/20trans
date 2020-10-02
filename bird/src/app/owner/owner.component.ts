import {Component, Input} from '@angular/core'


@Component({
    selector:'app-owner',
    templateUrl:'owner.component.html'
})


export class OwnerComponent{
   
    Constructor(){
        console.log('Owner Component');
    }
}