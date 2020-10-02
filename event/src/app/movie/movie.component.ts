import {Component} from '@angular/core'
import {MovieData} from './movie.data'

@Component({
    selector:'app-movie',
    templateUrl:'./movie.component.html'
})

export class MovieComponent{

    dataList: MovieData[];
    bigNum:boolean=false;

    constructor(){
        console.log('Movie Component')

            let movie1:MovieData= new MovieData('KGF','Hombale','Kannada',100);
            let movie2:MovieData= new MovieData('Bellbottom','RS','Kannada',20);
            let movie3:MovieData= new MovieData('AEG','Marvels','English',500);
            let movie4:MovieData= new MovieData('DilBechara','FoxStar','Hindi',10);

            this.dataList=[movie1,movie2,movie3,movie4];

           
    }
}
