import {Directive,ElementRef, HostListener, Input} from '@angular/core'

@Directive({
    selector:'[appbold]'
})

export class BoldDirective{

    @Input('enter')
    onenter;

    @Input('leave')
    onleave;

    dBClick='40px';

    constructor(private elementRef:ElementRef){
        console.log('bold directive');
        console.log(elementRef.nativeElement);
        this.elementRef.nativeElement.style.fontWeight='bold';
        this.elementRef.nativeElement.style.color='green';
    }

    @HostListener('mouseenter')
    onMouseEnter(){
        console.log('mouse entered')
        this.elementRef.nativeElement.style.color=this.onenter;
    }

    @HostListener('mouseleave')
    onMouseLeave(){
        console.log('mouse left')
        this.elementRef.nativeElement.style.color=this.onleave;
    }

    @HostListener('click')
    onMouseClick(){
        console.log('mouse clicked');
        this.elementRef.nativeElement.style.fontSize='100px';
    }
   
    @HostListener('dblclick')
    onMouseDoubleClick(){
        console.log('mouse Double clicked');
        this.elementRef.nativeElement.style.fontSize=this.dBClick ;
    }
   

}