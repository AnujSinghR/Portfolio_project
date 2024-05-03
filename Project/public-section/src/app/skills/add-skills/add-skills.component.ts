import { Component, OnInit , Input} from '@angular/core';
interface SkillCard {
  title: string;
  skills: { name: string, percentage: string }[];
}

@Component({
  selector: 'app-add-skills',
  templateUrl: './add-skills.component.html',
  styleUrls: ['./add-skills.component.css']
})
export class AddSkillsComponent implements OnInit {

  @Input() Skills:any;
 
  constructor() {
   
    }

  ngOnInit(): void {
  }

}
