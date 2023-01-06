import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ToDoComponent } from './to-do/to-do.component';
import {HttpClientModule} from "@angular/common/http";
import { ToDoCountComponent } from './to-do-count/to-do-count.component';
import { ToDoCompletedCountComponent } from './to-do-completed-count/to-do-completed-count.component';

@NgModule({
  declarations: [
    AppComponent,
    ToDoComponent,
    ToDoCountComponent,
    ToDoCompletedCountComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
