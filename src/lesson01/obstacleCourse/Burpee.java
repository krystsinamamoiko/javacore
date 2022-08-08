package lesson01.obstacleCourse;

import lesson01.team.TeamMember;

public class Burpee extends Obstacle {
    public Burpee(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.doBurpee(super.getDifficulty());
    }
}
