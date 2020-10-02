import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import{GreenComponent} from './Green/green.component'
import{RedComponent} from './Red/red.component';
import{BlueComponent} from './Blue/blue.component'


@NgModule({
  declarations: [
    AppComponent,GreenComponent,RedComponent,BlueComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
