import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {TeamMember} from './TeamMember';



//TODO : Is this necessary?
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': 'http://localhost'
  })
};

@Injectable()
export class TeamMembersService {

  teamMembersObject;

  constructor(private http : HttpClient) { }

  getAllTeamMembers()  {
      return this.http.get('http://localhost:8080/getMembers');
  }

  addTeamMember(obj: TeamMember,photoUrl){
    console.log(obj);
    console.log(photoUrl);
   
  
     return this.http.post('http://localhost:8080/addTeamMember',
      {
        "firstName" : obj.firstName,
        "lastName" : obj.funFact,
        "funfact" : obj.funFact,
        "photoUrl": photoUrl
      }).subscribe(reponse => {});
  }

  removeTeamMember(id){
    console.log(id)
    return this.http.get('http://localhost:8080/deleteTeamMemberById/' + id).subscribe(reponse => {});
     
  }


  }

