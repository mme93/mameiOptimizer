import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tasktool',
  templateUrl: './tasktool.page.html',
  styleUrls: ['./tasktool.page.scss'],
})
export class TasktoolPage implements OnInit {

  isShowDays=false;

  constructor() { }

  ngOnInit() {
  }

}
