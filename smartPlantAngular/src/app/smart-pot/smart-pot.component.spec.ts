import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SmartPotComponent } from './smart-pot.component';

describe('SmartPotComponent', () => {
  let component: SmartPotComponent;
  let fixture: ComponentFixture<SmartPotComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SmartPotComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SmartPotComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
