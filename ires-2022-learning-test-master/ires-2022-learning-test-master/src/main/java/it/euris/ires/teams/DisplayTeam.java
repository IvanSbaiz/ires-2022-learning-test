package it.euris.ires.teams;

public class DisplayTeam implements TeamManagement{

  private Team idSquadra;
  private Person nomePerson;


  private TeamManagementMediator teamManagementMediator;

  public DisplayTeam(TeamManagementMediator teamManagementMediator) {
    this.teamManagementMediator = teamManagementMediator;
  }


  @Override
  public void sendCommand(String command) {
    teamManagementMediator.showTeam(idSquadra);

  }
}
