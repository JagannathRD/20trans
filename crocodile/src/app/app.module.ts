import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {TorchComponent} from './Torch/torch.component';
import{PlanetComponent} from './Planet/planet.component'

@NgModule({
  declarations: [
    AppComponent,TorchComponent,PlanetComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [], 
  bootstrap: [AppComponent]
})
export class AppModule { }
