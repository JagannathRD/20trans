import {Routes, RouterModule} from '@angular/router';
import {SearchComponent} from './search/search.component';
import {HomeComponent} from './home/home.component';
import {NgModule} from '@angular/core'
import { Route } from '@angular/compiler/src/core';
import { ExpenseComponent } from './expense/expense.component';


const homeRoute ={ path: 'home', component:HomeComponent};
const searchRoute ={path: 'search', component:SearchComponent};
const expenseRoute={path:'expense', component:ExpenseComponent}
const routes: Routes =[homeRoute, searchRoute,expenseRoute];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class XworkzRouteModule{
    constructor(){
        console.log('Creted XworkzRoutModule')
    }
}