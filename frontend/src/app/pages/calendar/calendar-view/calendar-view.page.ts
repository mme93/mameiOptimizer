import {Component, OnInit, ViewChild} from '@angular/core';
import {CalendarComponent} from 'ionic2-calendar';


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

  constructor() {
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
  createNewEvent() {

  }
}
