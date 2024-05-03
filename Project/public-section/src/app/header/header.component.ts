import {  Component, OnInit ,ViewChild, ElementRef, AfterViewInit, Renderer2} from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements AfterViewInit {

 
  display:string = 'header-menu-none';
  image:String = 'assets/list.svg';
  menuClicked():void{
          if(this.display=='header-menu-none'){
                 this.display='header-menu';
                 this.image='assets/cancel.svg'
          }else{
            this.display='header-menu-none';
            this.image='assets/list.svg'
          }
          console.log('btn clicked');
  }

 
  constructor(private renderer: Renderer2) { }
  ngAfterViewInit(): void {
    //throw new Error('Method not implemented.');
  }

  scrollToComponent(componentId: string): void {
    const element = document.getElementById(componentId);
    console.log("element id"+element)
    if (element) {
      element.scrollIntoView({ behavior: 'smooth', block: 'start' });
    }
  }
}
