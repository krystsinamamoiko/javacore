package lesson01.team;

import lesson01.Status;

public class TeamMember {
    private String name;
    private int power;
    private Status status;

    public TeamMember(String name, int power) {
        this.name = name;
        this.power = power;
        this.status = Status.NOT_STARTED;
    }

    public Status getStatus() {
        return status;
    }

    public void squat(int difficulty) {
        if (difficulty < power) {
            System.out.println("(+) Team member " + name + " did deed squats");
            this.status = Status.PASSED;
        } else {
            System.out.println("Team member " + name + " did not do squats");
            this.status = Status.FAILED;
        }
    }

    public void pushUp(int difficulty) {
        if (difficulty < power) {
            System.out.println("(+) Team member " + name + " did deed push ups");
            this.status = Status.PASSED;
        } else {
            System.out.println("(-) Team member " + name + " did not do push ups");
            this.status = Status.FAILED;
        }
    }

    public void doPlank(int difficulty) {
        if (difficulty < power) {
            System.out.println("(+) Team member " + name + " did deed plank");
            this.status = Status.PASSED;
        } else {
            System.out.println("(-) Team member " + name + " did not do plank");
            this.status = Status.FAILED;
        }
    }

    public void doBurpee(int difficulty) {
        if (difficulty < power) {
            System.out.println("(+) Team member " + name + " did burpees");
            this.status = Status.PASSED;
        } else {
            System.out.println("(-) Team member " + name + " did not do burpees");
            this.status = Status.FAILED;
        }
    }

    public void deadLift(int difficulty) {
        if (difficulty < power) {
            System.out.println("(+) Team member " + name + " did deed lift");
            this.status = Status.PASSED;
        } else {
            System.out.println("(-) Team member " + name + " did not do deed lift");
            this.status = Status.FAILED;
        }
    }

    public void showMemberResults() {
        switch(this.status) {
            case FAILED:
                System.out.println("(-) Team member " + name + " did not complete obstacle course ");
                break;
            case PASSED:
                System.out.println("(+) Team member " + name + " completed obstacle course successfully");
                break;
            case NOT_STARTED:
                System.out.println("(!) Team member " + name + " did not start going obstacle course");
                break;
            default:
                throw new IllegalStateException("'" + status + "' is undefined");
        }
    }
}
