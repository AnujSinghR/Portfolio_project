import { Component, OnInit } from '@angular/core';
import { Title } from '@angular/platform-browser';
import { ClientDataService } from './client-data.service';

interface portfolio {
  userId:Number;
  name:String;
  email:String;
  photoProfile:String;
  description:String;
};

interface aboutUs {
  aboutMeId:Number;
  portfolioUserId:Number;
  photoFilePath:String;
  active:boolean;
  description:String;
  aboutMeNav:{
    id:Number;
    aboutMeId:Number;
    active:boolean;
    aboutMeName:String;
    imgaeUrl:String;
    description:String;
  }[];
}

interface competeces {
  active:boolean;
  competenceId:Number;
  portfolioUserId:Number;
  name:String;
  description:String;
  skillCategory:{
    skillCategoryId:Number;
    skillCategory:String;
    competenceId:Number;
    skillEntityList:{
      id:Number;
      skillname:String;
      active:boolean;
      skillCategoryId:Number;
      description:String;
      skillRate:Number;
    }[];
  }[];
};

interface education {
  educationId:Number;
  portPofolioId:Number;
  name:String;
  educationDescription:String;
  enable:Boolean;
  educationDetailModelList:{
    educationDetailId:Number;
    educationId:Number;
    name:String;
    educationalDescription:String;
    startYear:Number;
    endYear:Number;
  }[];
};

interface experience {
  experienceId:Number;
  portfolioId:Number;
  name:String;
  enable:Boolean;
  experienceCategoryModelList:{
    experienceCategoryId:Number;
    experienceId:Number;
    categoryName:String;
    experienceDetailsEntities:{
      experienceDetailId:Number;
      experienceCategoryId:number;
      name:String;
      experiencedescription:String;
      img:String;
    }[];
  }[];
};

interface socialNetwork {
  socialNetwork:{
    id:Number;
    portfolioId:Number;
    name:Number;
    url:String;
    active:boolean;
  }[];
};

interface userAllData {
  portfolio:portfolio;
  aboutUs:aboutUs;
  competeces:competeces;
  education:education;
  experience:experience;
  socialNetwork:socialNetwork;
};

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  jsonData: any;
  UserAllData!: userAllData;
  constructor(private clientDataService:ClientDataService){
   
   
   }
  ngOnInit(): void {
    const data = {"email":"Nic@test.com"};
    this.clientDataService.getAllData(data).subscribe((response)=> {
      this.jsonData = response;
      this.UserAllData = this.jsonData;
      console.log('this is under app comp',this.UserAllData);
    });
  }


}
