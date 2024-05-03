import { Component, OnInit ,Input} from '@angular/core';

interface experienceSec {
  btnName:string;
  experiences: { name: string, imgPath: string,dis:string,skills:string[] }[];
}

@Component({
  selector: 'app-add-experience',
  templateUrl: './add-experience.component.html',
  styleUrls: ['./add-experience.component.css']
})
export class AddExperienceComponent implements OnInit {
  
   @Input() experience:any;

  constructor() {

   }

  ngOnInit(): void {
    console.log('under add experience',this.experience)
  }

}
