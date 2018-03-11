import { TestBed, inject } from '@angular/core/testing';

import { TeamMembersService } from './team-members.service';

describe('TeamMembersService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TeamMembersService]
    });
  });

  it('should be created', inject([TeamMembersService], (service: TeamMembersService) => {
    expect(service).toBeTruthy();
  }));
});
