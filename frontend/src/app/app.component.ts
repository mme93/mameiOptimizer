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

  constructor(private componentService: ComponentsService,private menu: MenuController) {

  }
  closeMenu(){
    this.menu.close('componentMenu');
  }
  ngOnInit(): void {
    this.componentService.getAllComponents().forEach(components => {
      components.forEach(component => {
        this.componentArray.push(component);
      });
    });
  }

}
