import { Component, OnInit,Input } from '@angular/core';

@Component({
  selector: 'app-discription',
  templateUrl: './discription.component.html',
  styleUrls: ['./discription.component.css']
})
export class DiscriptionComponent implements OnInit {

  @Input() Discription:any;

  constructor() { }

  ngOnInit(): void {
  }

}
