import {Component} from '@angular/core'

@Component({
    selector:'app-course',
    template:'<h2>App Course</h2>'
})




export class CourseComponent{
    constructor(){
        console.log('Course Component')
    }
}