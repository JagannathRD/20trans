import {Pipe, PipeTransform} from '@angular/core';


@Pipe({
    name: 'salutation'
})
export class SalutationPipe implements PipeTransform{

transform(value:String, paramater:string){
    console.log(value);
    console.log(paramater);

}



}