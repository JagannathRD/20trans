import {Component} from '@angular/core'

@Component({
    selector:'app-blue',
    template:'<h3>Hi this is inline html and css</h3>',
    styles:['h3{color:blue']
})


export class BlueComponent{
constructor(){
    console.log('Constructor blue');
}
}