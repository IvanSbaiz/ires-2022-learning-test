package it.euris.ires.teams;

import lombok.Data;


public class CreateTeam implements TeamManagement{

  private Team idSquadra;
  private TeamManagementMediator teamManagementMediator;

  public CreateTeam(TeamManagementMediator teamManagementMediator) {
    this.teamManagementMediator = teamManagementMediator;
  }


  @Override
  public void sendCommand(String command) {
    teamManagementMediator.registerTeam(idSquadra);

  }
}
