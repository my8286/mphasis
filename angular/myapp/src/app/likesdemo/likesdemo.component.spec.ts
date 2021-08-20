import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LikesdemoComponent } from './likesdemo.component';

describe('LikesdemoComponent', () => {
  let component: LikesdemoComponent;
  let fixture: ComponentFixture<LikesdemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LikesdemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LikesdemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
