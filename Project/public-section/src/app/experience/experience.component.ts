import { Component, OnInit ,Input} from '@angular/core';

interface exp {
    id:number;
    btnName:string;
    projects:{title:string,path:string,discription:string,skills:string}[];
}

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css']
})
export class ExperienceComponent implements OnInit {

  @Input() experience:any;
  experiencetype:number=0;
  projectClicked(){
   this.experiencetype=0;
  }
  experienceClicked(){
    this.experiencetype=1;
  }

  constructor() {}

  ngOnInit(): void {
    console.log('full experience section obj',this.experience)
  }

}
