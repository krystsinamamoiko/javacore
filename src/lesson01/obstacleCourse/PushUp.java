package lesson01.obstacleCourse;

import lesson01.team.TeamMember;

public class PushUp extends Obstacle {
    public PushUp(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.pushUp(super.getDifficulty());
    }
}
