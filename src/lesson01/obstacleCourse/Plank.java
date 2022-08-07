package lesson01.obstacleCourse;

import lesson01.team.TeamMember;

public class Plank extends Obstacle {
    public Plank(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.doPlank(super.getDifficulty());
    }
}
