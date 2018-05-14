import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IshikawaComponent } from './ishikawa.component';

describe('IshikawaComponent', () => {
  let component: IshikawaComponent;
  let fixture: ComponentFixture<IshikawaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IshikawaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IshikawaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
