package lesson01.team;

import lesson01.Status;

public class Team {
    private String title;
    private TeamMember[] members;

    public Team(String title, TeamMember...members) {
        this.title = title;
        this.members = members;
    }

    public TeamMember[] getMembers() {
        return members;
    }

    public String getTitle() {
        return title;
    }

    /**
     * Print information about team members, who has gone the full distance successfully.
     */
    public void showSuccessfulResults() {
        System.out.println("--------------'" + title + "' team's successful results:");
        for(TeamMember member:members) {
            if (member.getStatus() == Status.PASSED) {
                member.showMemberResults();
            }
        }
        printSplitter();
    }

    /**
     * Print information about all team members.
     */
    public void showResults() {
        System.out.println("--------------All '" + title + "' team's results:");
        for(TeamMember member:members) {
            member.showMemberResults();
        }
        printSplitter();
    }

    public void printSplitter() {
        System.out.println("-------------------------------------------------");
    }
}
