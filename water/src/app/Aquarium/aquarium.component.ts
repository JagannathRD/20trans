import { AquariumData } from "./aquarium.data";

import {Component} from '@angular/core'

@Component({
    selector:'app-aquarium',
    templateUrl:'./aquarium.component.html'
})
 
export class AquariumComponent{

    aquarium:AquariumData=new AquariumData('bowl' ,1200,
    'medium',false, 300 );

    fishTypes=['GoldFish','Grame','ParrotFish','Fighter'];


    constructor(){
        console.log('Aquarium component');
    }
}