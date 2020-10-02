import {Component} from '@angular/core'

@Component({
    selector:'app-about',
    template:'<h2>App About</h2>'
})




export class AboutComponent{
    constructor(){
        console.log('About Component')
    }
}