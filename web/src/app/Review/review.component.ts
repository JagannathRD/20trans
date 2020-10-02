import {Component} from '@angular/core'

@Component({
    selector:'app-review',
    template:'<h2>App Review</h2>'
})




export class ReviewComponent{
    constructor(){
        console.log('Review Component')
    }
}