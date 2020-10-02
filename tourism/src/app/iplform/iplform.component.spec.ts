import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IplformComponent } from './iplform.component';

describe('IplformComponent', () => {
  let component: IplformComponent;
  let fixture: ComponentFixture<IplformComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IplformComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IplformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
