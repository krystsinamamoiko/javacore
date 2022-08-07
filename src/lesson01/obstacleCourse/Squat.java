package lesson01.obstacleCourse;

import lesson01.team.TeamMember;

public class Squat extends Obstacle {
    public Squat(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.squat(super.getDifficulty());
    }
}
