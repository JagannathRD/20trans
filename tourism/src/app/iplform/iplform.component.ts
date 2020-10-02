import { Component, OnInit } from '@angular/core';
import {FormControl} from '@angular/forms'


@Component({
  selector: 'app-iplform',
  templateUrl: './iplform.component.html',
  styleUrls: ['./iplform.component.css']
})
export class IplformComponent implements OnInit {

  teams: FormControl = new FormControl();
  
  constructor() { }

  ngOnInit(): void {
  }

}
