import { TestBed } from '@angular/core/testing';

import { ToDoBackendService } from './to-do-backend.service';

describe('ToDoBackendService', () => {
  let service: ToDoBackendService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ToDoBackendService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
