package it.euris.ires.teams;

public class DisplayFull implements TeamManagement  {

  private Team idSquadra;
  private Person nomePerson;
  private TeamManagementMediator teamManagementMediator;

  public DisplayFull(TeamManagementMediator teamManagementMediator) {
    this.teamManagementMediator = teamManagementMediator;
  }

  @Override
  public void sendCommand(String command) {
    teamManagementMediator.showFull(idSquadra, nomePerson);

  }
}
