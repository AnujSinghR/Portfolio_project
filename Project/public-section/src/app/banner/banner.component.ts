import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-banner',
  templateUrl: './banner.component.html',
  styleUrls: ['./banner.component.css']
})
export class BannerComponent implements OnInit {
  @Input() portfolio:any;
  banner:string = "background-image: url('src/assets/background-image.jpg')";
  
  constructor() {
         
   }

  ngOnInit(): void {

    this.banner = `background-image:url(${this.portfolio.photoProfile})`
  }

}
