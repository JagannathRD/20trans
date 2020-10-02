export class PlanetData{
    name:String;
    isLiveable:boolean;
    distanceFromSun:number;


    constructor(name:String, isLiveable:boolean, distanceFromSun?:number){
        console.log("from planet Data");
        this.name=name;
        this.isLiveable=isLiveable;
        this.distanceFromSun=distanceFromSun;
    }
}