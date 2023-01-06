import { Component } from '@angular/core';
import {ToDoBackendService} from "../services/to-do-backend.service";

@Component({
  selector: 'app-to-do-count',
  templateUrl: './to-do-count.component.html',
  styleUrls: ['./to-do-count.component.scss']
})
export class ToDoCountComponent {
  count  = 0;
  constructor(private todoBackendService : ToDoBackendService) {

    this.todoBackendService.todos.subscribe(data=>{
      this.count = data.length;
    });
  }
}
