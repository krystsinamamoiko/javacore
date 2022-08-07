package lesson01.obstacleCourse;

import lesson01.team.TeamMember;

public abstract class Obstacle {
    private final int difficulty;

    public Obstacle(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public abstract void goChallenge(TeamMember member);
}
