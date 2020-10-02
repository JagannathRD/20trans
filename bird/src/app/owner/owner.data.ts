export class OwnerData{
    firstName:string;
    lastName:string;
    documents:string;
    long:number;

    constructor( firstName:string,lastName:string,documents:string,
    long:number){
        console.log('Owner Data')
        this.firstName=firstName;
        this.lastName=lastName;
        this.documents=documents;
        this.long=long;
    }
}