import {Component} from '@angular/core'

@Component({
    selector:'app-search',
    template:'<h2>App Search<h2>'
})

export class SearchComponent{
    constructor(){
        console.log('Search Component')
    }
}