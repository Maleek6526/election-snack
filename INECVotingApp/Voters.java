package INECVotingApp;

public class Voters {
    private String name;
    private int votersID;
    private int votersAge;
    private boolean hasVoted = false;

    public Voters(String name, int votersID, int votersAge) {
        if (votersAge >= 18) {
            this.name = name;
            this.votersID = votersID;
            this.votersAge = votersAge;
        } else {
            throw new IllegalArgumentException("You must be more than 18 years old to vote");
        }
    }

    public String getVotersFullName() {
        return name;
    }

    public int getVotersID() {
        return votersID;
    }

    public int getVotersAge() {
        return votersAge;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void markAsVoted() {
        this.hasVoted = true;
    }

    public void castVote(INEC inec, int candidateID) {
        inec.castVote(this.votersID, candidateID);
    }
}
