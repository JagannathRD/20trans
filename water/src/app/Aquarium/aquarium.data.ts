export class AquariumData{
    type:String;
    price:number;
    size:String;
    withPump:boolean;
    liters:number;
    

    
    constructor( type:String, price:number, size:String,
        withPump:boolean,liters:number){

        console.log('Aquarium Data');
        this.type=type;
        this.price=price;
        this.size=size;
        this.withPump=withPump;
        this.liters=liters;
    }
}