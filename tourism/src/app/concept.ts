import {Observable,Observer} from 'rxjs'

function email(){
return 'Hello world';
}

let emailValue=email();
console.log(emailValue);

let obs:Observable<string>=new Observable(observer=>{
    observer.next('Hello Whole world');
    observer.next('Hello......')
    setTimeout(()=>{
        observer.next('OK>>>>>>');
    }
    ,3000);
}
    );

    obs.subscribe(data =>{
        console.log(data);
    });

    obs.subscribe(data =>{
        console.log(data);
    });