 import { Component,Input } from '@angular/core';
 import {OwnerData} from './owner/owner.data'
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'bird';
  @Input()
  data:OwnerData;
  own:OwnerData =new OwnerData('Jaggu', 'Dindoor','docs',3)
}
