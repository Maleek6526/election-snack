package INECVotingApp;

public class Candidates {
    private String name;
    private int candidateID;
    private int candidateAge;
    private String pincode;
    private int voteCount;

    public Candidates(String name, int candidateID, int candidateAge, String pincode, int voteCount) {
        if (candidateAge >= 40) {
            this.name = name;
            this.candidateID = candidateID;
            this.candidateAge = candidateAge;
            this.pincode = pincode;
            this.voteCount = voteCount;
        } else {
            throw new IllegalArgumentException("Candidate must be at least 40 years old");
        }
    }

    public String getName() {
        return name;
    }
    public int getCandidateAge(){
        return candidateAge;
    }

    public int getCandidateID() {
        return candidateID;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void incrementVote() {
        this.voteCount++;
    }

    public void validateCandidatePincode(String pincode) {
        if (!pincode.equals(this.pincode)) {
            throw new IllegalArgumentException("Invalid Pincode");
        }
    }
}
