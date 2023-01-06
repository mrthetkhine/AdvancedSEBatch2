import { Component } from '@angular/core';
import {ToDoBackendService} from "../services/to-do-backend.service";
import {ToDo} from "../to-do";

@Component({
  selector: 'app-to-do',
  templateUrl: './to-do.component.html',
  styleUrls: ['./to-do.component.scss']
})
export class ToDoComponent {

    todos:Array<ToDo>  = [];
    constructor(private todoService :ToDoBackendService) {
    }
    ngOnInit()
    {
      console.log('NgOnInit');
      this.todoService.todos.subscribe(data=>this.todos = data);
    }
    deleteToDo(todo:ToDo)
    {
      console.log("Delete todo ",todo);
      this.todoService.deleteToDo(todo);
    }
}
