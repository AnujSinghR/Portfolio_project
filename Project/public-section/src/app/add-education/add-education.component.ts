import { Component, OnInit,Input } from '@angular/core';

@Component({
  selector: 'app-add-education',
  templateUrl: './add-education.component.html',
  styleUrls: ['./add-education.component.css']
})
export class AddEducationComponent implements OnInit {
  
  @Input() Education:any;

  constructor() { }

  ngOnInit(): void {
  }

}
