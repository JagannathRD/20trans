import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {AboutComponent} from './about/about.component'
import {CourseComponent} from './course/course.component'
import{ReviewComponent} from './Review/review.component'


@NgModule({
  declarations: [
    AppComponent,AboutComponent,CourseComponent,ReviewComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
