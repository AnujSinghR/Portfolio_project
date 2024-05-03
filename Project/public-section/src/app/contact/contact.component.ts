import { Component, OnInit,Input } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  @Input() socialNetwork:any;

  openTwitter(){
    window.open(this.socialNetwork.socialNetwork[0].url, '_blank');
  }
  openLinkdin(){
    window.open(this.socialNetwork.socialNetwork[1].url,'_blank');
  }
  openGithub(){
    window.open(this.socialNetwork.socialNetwork[2].url,'_blank');
  }

  download(){
    //window.open('https://github.com','_blank');
  }
  constructor() { }

  ngOnInit(): void {
  }

}
