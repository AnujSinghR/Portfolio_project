import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import {MatCardModule} from '@angular/material/card';
import {MatToolbarModule} from '@angular/material/toolbar';
import { BannerComponent } from './banner/banner.component';
import { AboutComponent } from './about/about.component';
import { HobbiesComponent } from './about/hobbies/hobbies.component';
import { StrengthsComponent } from './about/strengths/strengths.component';
import { LanguagesComponent } from './about/languages/languages.component';
import { DiscriptionComponent } from './about/discription/discription.component';
import { SkillsComponent } from './skills/skills.component';
import { AddSkillsComponent } from './skills/add-skills/add-skills.component';
import { EducationComponent } from './education/education.component';
import { AddEducationComponent } from './add-education/add-education.component';
import { ExperienceComponent } from './experience/experience.component';
import { AddExperienceComponent } from './add-experience/add-experience.component';
import { ContactComponent } from './contact/contact.component';
import { ProjectsComponent } from './experience/projects/projects.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    BannerComponent,
    AboutComponent,
    HobbiesComponent,
    StrengthsComponent,
    LanguagesComponent,
    DiscriptionComponent,
    SkillsComponent,
    AddSkillsComponent,
    EducationComponent,
    AddEducationComponent,
    ExperienceComponent,
    AddExperienceComponent,
    ContactComponent,
    ProjectsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatCardModule,
    MatToolbarModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
