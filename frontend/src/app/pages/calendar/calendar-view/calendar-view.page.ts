import {Component, OnInit, ViewChild} from '@angular/core';
import {CalendarComponent} from 'ionic2-calendar';
import {ModalController} from '@ionic/angular';
import {CalenderEventComponent} from './calender-event/calender-event.component';


@Component({
  selector: 'app-calendar-view',
  templateUrl: './calendar-view.page.html',
  styleUrls: ['./calendar-view.page.scss'],
})
export class CalendarViewPage implements OnInit {
  eventSource = [];
  viewTitle: string;
  calendar = {
    mode: 'month',
    currentDate: new Date(),
  };

  @ViewChild(CalendarComponent) myCal: CalendarComponent;

  constructor(private modalController: ModalController) {
  }

  ngOnInit() {
  }

  changeMode(mode: string) {
    this.calendar.mode = mode;
  }

  onViewTitleChanged(title) {
    this.viewTitle = title;
  }
  today() {
    this.calendar.currentDate = new Date();
  }
  async createNewEvent() {
    //https://edupala.com/ionic-modal-controller-exmple/
    const modal= await this.modalController.create({
      component: CalenderEventComponent
    });
    modal.present();
  }
}
