import {HttpClient} from '@angular/common/http'
import {Injectable} from '@angular/core'
import { Observable } from 'rxjs';


@Injectable()
export class PoliticianService{



    constructor(private http:HttpClient){
        console.log('created politician service')
        console.log(http);
    }

    get politicianName(): Observable<string[]>{
        let url= 'assets/politician.names.json';
        let observable:Observable<string[]>=this.http.get<string[]>(url);
        return observable;
    }
}