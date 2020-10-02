import { PlanetData } from "./planet.data";

import {Component} from '@angular/core';


@Component({
    selector:'app-planet',
    templateUrl:'./planet.component.html' 
   })

export class PlanetComponent{
planet:PlanetData= new PlanetData('jupiter' , false);   

constructor(){
    console.log('Planet component');
}

}