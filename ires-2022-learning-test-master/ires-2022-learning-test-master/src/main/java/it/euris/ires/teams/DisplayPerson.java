package it.euris.ires.teams;

public class DisplayPerson implements TeamManagement{

  private TeamManagementMediator teamManagementMediator;
  private Person nomePerson;

  public DisplayPerson(TeamManagementMediator teamManagementMediator) {
    this.teamManagementMediator = teamManagementMediator;
  }

  @Override
  public void sendCommand(String command) {
    teamManagementMediator.showPerson(nomePerson);
  }
}
