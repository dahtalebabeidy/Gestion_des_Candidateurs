package model;

public class AO {
	private String id;
    private String deadline;

    public AO(String id, String deadline) {
        this.id = id;
        this.deadline = deadline;
    }

    public String getId() {
        return id;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String newDeadline) {
        this.deadline = newDeadline;
    }
}
