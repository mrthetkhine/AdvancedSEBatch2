import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ToDoCountComponent } from './to-do-count.component';

describe('ToDoCountComponent', () => {
  let component: ToDoCountComponent;
  let fixture: ComponentFixture<ToDoCountComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ToDoCountComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ToDoCountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
