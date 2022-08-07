package lesson01.obstacleCourse;

import lesson01.team.TeamMember;

public class DeadLift extends Obstacle {
    public DeadLift(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.deadLift(super.getDifficulty());
    }
}
