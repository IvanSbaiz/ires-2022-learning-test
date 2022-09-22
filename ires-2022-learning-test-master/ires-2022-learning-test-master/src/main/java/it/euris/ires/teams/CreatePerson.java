package it.euris.ires.teams;

public class CreatePerson implements TeamManagement{

  private TeamManagementMediator teamManagementMediator;
  private Person nomePerson;

  public CreatePerson(TeamManagementMediator teamManagementMediator) {
    this.teamManagementMediator = teamManagementMediator;
  }


  @Override
  public void sendCommand(String command) {
    teamManagementMediator.registerPerson(nomePerson);
  }

}
