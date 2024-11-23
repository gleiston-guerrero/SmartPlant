import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { PersonComponent } from './person/person.component';
import { UserSmartPotComponent } from './user-smart-pot/user-smart-pot.component';
import { NotificationComponent } from './notification/notification.component';
import { WebSocketComponent } from './web-socket/web-socket.component';
import { ReportComponent } from './report/report.component';
import { PlantComponent } from './plant/plant.component';
import { RelativeComponent } from './relative/relative.component';
import { SmartPotComponent } from './smart-pot/smart-pot.component';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    PersonComponent,
    UserSmartPotComponent,
    NotificationComponent,
    WebSocketComponent,
    ReportComponent,
    PlantComponent,
    RelativeComponent,
    SmartPotComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
