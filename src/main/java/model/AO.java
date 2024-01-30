package model;

public class AO {
	private String id;
    private String deadline;
    private String proposal;

    public AO(String id, String deadline, String proposal) {
        this.id = id;
        this.deadline = deadline;
        this.proposal = proposal;
    }

    public String getProposal() {
		return proposal;
	}

	public void setProposal(String proposal) {
		this.proposal = proposal;
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
