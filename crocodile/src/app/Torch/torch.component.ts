import {Component} from '@angular/core'
 


@Component({
    selector:'app-torch',
    templateUrl:'torch.component.html',
    styles:['h3,h4{color:red']
    
})
export class TorchComponent{
    material='metal'
    torchIsWorking=false;
    cellPercent=['20%','30%','40%']; 
    price=50.50;
   

    constructor(){
        console.log("this is a torch");
    }
}