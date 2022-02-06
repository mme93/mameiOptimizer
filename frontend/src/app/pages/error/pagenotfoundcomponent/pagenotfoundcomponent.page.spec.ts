import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { PagenotfoundcomponentPage } from './pagenotfoundcomponent.page';

describe('PagenotfoundcomponentPage', () => {
  let component: PagenotfoundcomponentPage;
  let fixture: ComponentFixture<PagenotfoundcomponentPage>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ PagenotfoundcomponentPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(PagenotfoundcomponentPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
