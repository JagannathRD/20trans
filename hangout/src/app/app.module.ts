import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {XworkzRouteModule} from './app.routing'
import { HomeComponent } from './home/home.component';
import { SearchComponent } from './search/search.component';
import { ExpenseComponent } from './expense/expense.component';
import {BoldDirective} from './directives/bold.directive'


@NgModule({
  declarations: [
    AppComponent,HomeComponent,SearchComponent, ExpenseComponent,BoldDirective
  ],
  imports: [
    BrowserModule, XworkzRouteModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
