import { Component } from '@angular/core';
import {ToDoBackendService} from "../services/to-do-backend.service";
import {filter} from "rxjs";
import {ToDo} from "../to-do";

@Component({
  selector: 'app-to-do-completed-count',
  templateUrl: './to-do-completed-count.component.html',
  styleUrls: ['./to-do-completed-count.component.scss']
})
export class ToDoCompletedCountComponent {

  count = 0;
  constructor(private todoBackend:ToDoBackendService) {

    this.todoBackend.todos
      .subscribe(data=>this.count= data.filter(todo=>todo.completed).length);
  }
}
