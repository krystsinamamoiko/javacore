package lesson01.obstacleCourse;

import lesson01.Status;
import lesson01.team.Team;
import lesson01.team.TeamMember;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle...obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        System.out.println("------------------------'"+ team.getTitle() + "' is going obstacle course...");
        for(TeamMember member:team.getMembers()) {
            for(Obstacle obstacle:obstacles) {
                obstacle.goChallenge(member);
                if (member.getStatus() == Status.FAILED) {
                    break;
                }
            }
        }
    }
}
