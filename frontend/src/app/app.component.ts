import {Component, OnInit} from '@angular/core';
import {Components} from './models/Components';
import {ComponentsService} from './services/http/components.service';
import {MenuController} from '@ionic/angular';


@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.scss'],
})
export class AppComponent implements OnInit {
  componentArray: Components[] = [];

  constructor(private componentService: ComponentsService, private menu: MenuController) {

  }

  closeMenu() {
    this.menu.close('componentMenu');
  }

  ngOnInit(): void {
    if(!this.isLoadMenuBar()){
      this.componentService.getAllComponents().forEach(components => {
        components.forEach(component => {
          this.componentArray.push(component);
        });
        this.setMenubar();
      });
    }else{
    this.initMenubar();
    }
  }
  initMenubar(){
    this.componentArray= JSON.parse(localStorage.getItem('menuBar'));
  }
  setMenubar(){
    localStorage.setItem('menuBar',JSON.stringify(this.componentArray));
  }
  isLoadMenuBar(){
    return (!(localStorage.getItem('menuBar') === null));
  }
}
