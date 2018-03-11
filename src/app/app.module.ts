import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { HttpModule } from '@angular/http';
import { AppComponent } from './app.component';
import { TeamMembersComponent } from './team-members/team-members.component';
import { TeamMembersService } from './team-members.service';
import {FormsModule} from '@angular/forms';
import { FileUploaderModule } from "ng4-file-upload";
import { Ng2SearchPipeModule } from 'ng2-search-filter';


@NgModule({
  declarations: [
    AppComponent,
    TeamMembersComponent,
  
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    HttpModule,
    FormsModule,
    FileUploaderModule,
    Ng2SearchPipeModule
  ],
  providers: [TeamMembersService],
  bootstrap: [AppComponent]
})
export class AppModule { }
