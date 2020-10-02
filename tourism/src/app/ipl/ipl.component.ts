import { Component, OnInit } from '@angular/core';
import { IPLService } from './ipl.service';
import { Observable, from } from 'rxjs';
import { PoliticianService } from './politician.service'
import {ComputerData} from './computer.data'
import {UserData} from './user.data'

@Component({
  selector: 'app-ipl',
  templateUrl: './ipl.component.html',
  styleUrls: ['./ipl.component.css']
})
export class IplComponent implements OnInit {

  teamNames=[];
  teamOwners=[];
  politicianNames: Observable<Array<string>>;
  computer: ComputerData={'touch':false ,'noOfKeys':0,'os':'','graphicsCard':''};
  userData=[];

  constructor(private iplService:IPLService, private politicianService: PoliticianService) {
    console.log('Created ipl component');
   }

  ngOnInit(): void {
    console.log('init component');

    let observable: Observable<string[]>= this.iplService.IplTeams;
    console.log('observable' +observable);

    observable.subscribe(data =>{
      console.log('invoked next')
      console.log(data);
      this.teamNames=data;



      let observable2: Observable<string[]>= this.iplService.teamOwners;
      observable2.subscribe(data2=>{
        this.teamOwners=data2;
      })
    })
  }

  showPolitician(){
    this.politicianNames=this.politicianService.politicianName;
  
    }

    showComputer(){
      console.log('invoked show computer');
      this.iplService.computerData.subscribe(next =>{
        console.log('data');
        console.log(next);
       this.computer=next;
      })
    }
    
    showUsers(){
      console.log('Show users');
      this.iplService.users.subscribe(next =>{
        console.log(next);
        this.userData=next;
      })
    }
}
