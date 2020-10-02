import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { Route } from '@angular/compiler/src/core';
import{VoteComponent} from './vote/vote.component';
import { ObservableComponent } from './observable/observable.component';
import { IplComponent } from './ipl/ipl.component';
import { LpgComponent } from './lpg/lpg.component';
import { IplformComponent } from './iplform/iplform.component';
import { CaptainComponent } from './captain/captain.component';

const voteRoute={path:'vote', component:VoteComponent}
const observableRoute={path:'observable', component:ObservableComponent}
const iplRoute={path:'ipl', component:IplComponent}
const formRoute={path:'reactive',component:LpgComponent}
const iplFormRoute={path:'iplForm', component:IplformComponent}
const captainRoute={path:'captainForm',component:CaptainComponent}

const routes: Routes = [voteRoute, observableRoute,
  iplRoute,formRoute,iplFormRoute,captainRoute ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
