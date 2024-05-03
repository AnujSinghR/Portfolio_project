import { Component, OnInit , Input } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
  client_image:String = 'assets/client-image.jpg';
  comp_about:boolean = true;
  comp_hobbies:boolean = false;
  comp_strengths:boolean = false;
  comp_languages:boolean = false;
  
  @Input() userAboutDetails:any;

  constructor() { }
    
  hobbiesClicked(){
    this.comp_about= false;
    this.comp_hobbies= true;
    this.comp_strengths= false;
    this.comp_languages= false;
  }
  strengthsClicked(){
    this.comp_about= false;
    this.comp_hobbies= false;
    this.comp_strengths= true;
    this.comp_languages= false;
  }
  languagesClicked(){
    this.comp_about= false;
    this.comp_hobbies= false;
    this.comp_strengths= false;
    this.comp_languages= true;
  }
  aboutClicked(){
    this.comp_about= true;
    this.comp_hobbies= false;
    this.comp_strengths= false;
    this.comp_languages= false;
  }
  

  ngOnInit(): void { 
    this.client_image= this.userAboutDetails.photoFilePath
  }

}
