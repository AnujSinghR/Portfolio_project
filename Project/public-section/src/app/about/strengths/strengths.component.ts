import { Component, OnInit ,Input } from '@angular/core';

@Component({
  selector: 'app-strengths',
  templateUrl: './strengths.component.html',
  styleUrls: ['./strengths.component.css']
})
export class StrengthsComponent implements OnInit {

  @Input() strengths:any;

  constructor() { }

  ngOnInit(): void {
  }

}
