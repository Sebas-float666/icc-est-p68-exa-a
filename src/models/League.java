package models;

public class League {
  String name;
  private Team[] teams;

  public League(String name, Team[] teams) {
    this.name = name;
    this.teams = teams;
  }

  public int getTotalActiveGoals() {
    int total = 0;
    for (int i = 0; i < teams.length; i++) {
      Player[] players = teams[i].getPlayers();
      for (int j = 0; j < players.length; j++) {
        if (players[j].isActive()) {
          total += players[j].getGoals();
        }
      }
    }
    return total;
  }

  public Team[] getTeams() {
    return teams;
  }

  public void setTeams(Team[] teams) {
    this.teams = teams;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
