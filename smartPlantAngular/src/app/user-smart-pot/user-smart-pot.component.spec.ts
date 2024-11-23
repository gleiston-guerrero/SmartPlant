import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserSmartPotComponent } from './user-smart-pot.component';

describe('UserSmartPotComponent', () => {
  let component: UserSmartPotComponent;
  let fixture: ComponentFixture<UserSmartPotComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserSmartPotComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserSmartPotComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
