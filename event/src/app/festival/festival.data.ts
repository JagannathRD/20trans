export class FestivalData{
    name:string;
    date:string;
    special:string;
    days:number;

    constructor(name:string,date:string,special:string,days:number){
        console.log('from festival data');
        this.name=name;
        this.date=date;
        this.special=special;
        this.days=days
    }
}