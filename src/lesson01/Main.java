package lesson01;

import lesson01.obstacleCourse.*;
import lesson01.team.Team;
import lesson01.team.TeamMember;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Burpee(20), new Plank(17), new PushUp(30), new DeadLift(50), new Squat(45)); // Создаем полосу препятствий
        // Create the first team
        Team team1 = new Team("Eagles", new TeamMember("Elvis", 100), new TeamMember("Helen", 45), new TeamMember("Ron", 39));
        // Create the second team
        Team team2 = new Team("Ducks", new TeamMember("Masha", 10), new TeamMember("Oleg", 55), new TeamMember("Kolya", 56));
        // Ask the first team to go the created above obstacle course
        c.doIt(team1);
        // Ask the second team to go the created above obstacle course
        c.doIt(team2);
        // Show all results of the first team
        team1.showResults();
        // Show members of the second team who have gone the created above obstacle course successfully
        team2.showSuccessfulResults();
    }
}
