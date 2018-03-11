import { Component, OnInit } from '@angular/core';
import {TeamMember} from '../TeamMember';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { TeamMembersService } from '../team-members.service';
import {NgForm} from '@angular/forms';
import * as _ from 'lodash';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
  })
};

@Component({
  selector: 'app-team-members',
  templateUrl: './team-members.component.html',
  styleUrls: ['./team-members.component.css']
})

export class TeamMembersComponent implements OnInit {

  public teamMembers:any;
  public base64textString : String
  public base64Files: string[] = new Array;
  private files: any[] = [];
  private fileReader = new FileReader();
  

  constructor(private teamMemberService : TeamMembersService) { 
    this.getAllTeamMembers();  //TODO : Take this out!
  }

  ngOnInit() {
      this.getAllTeamMembers()
  }

  getAllTeamMembers(){
      this.teamMemberService.getAllTeamMembers().subscribe(reponse => {
      this.teamMembers = reponse;
     });
   }

  onSubmit(form: NgForm) :void {
    console.log(form.value)
     this.teamMemberService.addTeamMember(form.value,this.base64textString);
     
  }

  removeMember(id :number) :void {
    this.teamMemberService.removeTeamMember(id);
  }

  public onChange(event: Event) {
    console.log("here");
    let files = event.target['files'];
    if (event.target['files']) {
      console.log(event.target['files']);
      this.readFiles(event.target['files'], 0);
    }
    return this.base64Files;
  };

  private readFiles(files: any[], index: number){
    let file = files[index];
    this.fileReader.onload = () => {
      console.log(this.fileReader.result);
      this.base64textString=this.fileReader.result;
      console.log(this.base64textString);
      this.base64Files.push(this.fileReader.result);
      if (files[index + 1]) {
        this.readFiles(files, index + 1);
      } else {
        console.log('loaded all files');
    };
      }
    this.fileReader.readAsDataURL(file);
    
  }
}
