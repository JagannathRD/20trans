import {Component} from '@angular/core'

@Component({
    selector:'app-home',
    template:'<h2>App Home<h2>'
})


export class HomeComponent{
    constructor(){
        console.log('Home component');
    }
}