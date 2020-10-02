import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import{FestivalComponent} from './festival/festival.component'
import{MovieComponent} from './movie/movie.component'

@NgModule({
  declarations: [
    AppComponent,FestivalComponent,MovieComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
