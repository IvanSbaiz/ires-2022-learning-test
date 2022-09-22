package it.euris.ires.teams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamManagementMediator {

  private List<Team> teams = new ArrayList<>();
  private List<Person> people = new ArrayList<>();


  public void registerTeam(Team team) {
    teams.add(team);
  }

  public void registerPerson(Person person) {
    people.add(person);
  }

  public void showTeam(Team team) {

  }


  public void showPerson(Person person) {

  }


  public void showFull(Team team, Person person) {

  }
}



