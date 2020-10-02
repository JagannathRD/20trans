import { FestivalData } from "./festival.data"
import {Component} from '@angular/core'

@Component({
    selector:'app-fest',
    templateUrl:'festival.component.html'
})



export class FestivalComponent{
    dataList:FestivalData[];
    arrayBig:boolean=false;

    constructor(){
        console.log('Festival Component')
        let fest1:FestivalData = new FestivalData('Dasara','oct-17','jumbo', 9);
        let fest2: FestivalData = new FestivalData('Deepavali','nov-23','firecrackers', 9);
        let fest3: FestivalData = new FestivalData('Ganesha','aug-22','kadabu', 5);
        let fest4: FestivalData = new FestivalData('Bakrid','july-23','Biryani', 3);

        this.dataList=[fest1, fest2, fest3, fest4];
        if(this.dataList.length>5){
            this.arrayBig=true;
        }
    }
}
