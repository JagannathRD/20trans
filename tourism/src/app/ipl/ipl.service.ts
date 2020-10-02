import {Observable} from 'rxjs'
import {HttpClient} from '@angular/common/http'
import { Injectable } from '@angular/core';
import { UserData } from './user.data';

@Injectable()
export class IPLService{

    constructor(private http:HttpClient){
        console.log('created ipl service');
    }

    get IplTeams(): Observable<string[]>{
    
    
   let iplTeamObservable: Observable<string[]> = new Observable<string[]>(observer =>{
        try{
            observer.next(['RCB','CSK','MI','RR']);
        }
        catch(error){
            observer.error('error in creating ipl names array');
      
    }
    observer.complete();
}); 
    return iplTeamObservable;
}

get teamOwners(): Observable<string[]>{
        
    let teamOwnersObservable: Observable<string[]> = new Observable<string[]>(observer =>{
         try{
             observer.next(['Mallya','Dhoni','Ambani','Shilpi']);
         }
         catch(error){
             observer.error('error in creating ipl names array');
       
     }
     observer.complete();
 });
     return teamOwnersObservable;
 }

 get computerData():Observable<Object>{
     let url='./assets/computer.data.json'
     let observable=this.http.get<Object>(url);
     return observable;
 }

 get users():Observable<UserData[]>{
        let url='https://jsonplaceholder.typicode.com/users'
        let observable=this.http.get<UserData[]>(url);
        return observable;
 }
}