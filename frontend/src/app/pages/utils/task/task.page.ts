import { Component, OnInit } from '@angular/core';
import {TaskService} from '../../../services/http/task.service';
import {MainTask} from '../../../models/MainTask';

@Component({
  selector: 'app-task',
  templateUrl: './task.page.html',
  styleUrls: ['./task.page.scss'],
})
export class TaskPage implements OnInit {
  mainTask: MainTask[]=[];
  constructor(private service: TaskService) { }

  ngOnInit() {
    this.service.getAllMainTask().forEach(value => {
      value.forEach( resultMainTask =>{
        this.mainTask.push(resultMainTask);
      });
    });
  }

}
