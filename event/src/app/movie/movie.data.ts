export class MovieData{
    name:String;
    producer:String;
    language:String;
    budget:number;
    high:number;

    constructor( name:String,producer:String,language:String,budget:number,high?){
        console.log('Movie Data');

        this.name=name;
        this.producer=producer;
        this.language=language;
        this.budget=budget;
        this.high=high;
        
    }

}