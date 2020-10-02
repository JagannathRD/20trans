import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PlaceComponent } from './place/place.component';
import { VoteComponent } from './vote/vote.component';
import { ObservableComponent } from './observable/observable.component';
import { IplComponent } from './ipl/ipl.component';
import {IPLService} from './ipl/ipl.service'
import {HttpClientModule} from '@angular/common/http'
import {PoliticianService} from './ipl/politician.service';
import { LpgComponent } from './lpg/lpg.component'
import {ReactiveFormsModule} from '@angular/forms';
import { IplformComponent } from './iplform/iplform.component';
import { CaptainComponent } from './captain/captain.component'



@NgModule({
  declarations: [
    AppComponent,
    PlaceComponent,
    VoteComponent,
    ObservableComponent,
    IplComponent,
    LpgComponent,
    IplformComponent,
    CaptainComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [IPLService,PoliticianService],
  bootstrap: [AppComponent]
})
export class AppModule { }
