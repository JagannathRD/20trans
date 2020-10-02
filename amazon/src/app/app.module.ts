import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { RootComponent } from './app.component';
import {WhiskeyComponent} from './Whiskey/whiskey.component';
import {AvengersComponent} from './Avengers/avengers.component';

@NgModule({
  declarations: [
    RootComponent,WhiskeyComponent,AvengersComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [RootComponent]
})
export class RootModule { 
constructor(){
  console.log('root module')
}
}
