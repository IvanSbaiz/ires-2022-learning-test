package it.euris.ires.teams;

public class Main {

  public static void main(String[] args) {
    TeamManagementMediator teamManagementMediator = new TeamManagementMediator();

    Team teamABC = new Team();
    Person personXYZ = new Person();

    teamManagementMediator.registerTeam(teamABC);
    teamManagementMediator.registerPerson(personXYZ);

    TeamManagement createTeam = new CreateTeam(teamManagementMediator);
    TeamManagement createPerson = new CreatePerson(teamManagementMediator);

    TeamManagement displayTeam = new DisplayTeam(teamManagementMediator);
    displayTeam.sendCommand("");

    TeamManagement displayPerson = new DisplayPerson(teamManagementMediator);
    displayPerson.sendCommand("");

    TeamManagement displayFull = new DisplayFull(teamManagementMediator);
    displayFull.sendCommand("");
  }

}
