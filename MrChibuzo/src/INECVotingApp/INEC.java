package INECVotingApp;

import java.util.ArrayList;

public class INEC {
    private ArrayList<Voters> voters = new ArrayList<>();
    private ArrayList<Candidates> candidates = new ArrayList<>();
    private int candidateCounter = 0;
    private int votersCounter = 0;

    public void addCandidates(String firstName, String lastName, String pincode, int candidateAge) {
        String fullName = firstName + " " + lastName;
        int candidateId = ++candidateCounter;
        Candidates newCandidate = new Candidates(fullName, candidateId, candidateAge, pincode, 0);
        candidates.add(newCandidate);
    }

    public void addVoters(String firstName, String lastName, String pincode, int votersAge) {
        String fullName = firstName + " " + lastName;
        int votersID = ++votersCounter;
        Voters newVoter = new Voters(fullName, votersID, votersAge);
        voters.add(newVoter);
    }

    public int getTotalCandidates() {
        return candidates.size();
    }

    public int getTotalVoters() {
        return voters.size();
    }

    public Candidates findCandidate(int candidateID) {
        for (Candidates candidate : candidates) {
            if (candidate.getCandidateID() == candidateID) {
                return candidate;
            }
        }
        throw new IllegalArgumentException("Candidate ID not found");
    }

    public Voters findVoter(int votersID) {
        for (Voters voter : voters) {
            if (voter.getVotersID() == votersID) {
                return voter;
            }
        }
        throw new IllegalArgumentException("Voter ID not found");
    }

    public void castVote(int votersID, int candidateID) {
        Voters voter = findVoter(votersID);

        if (voter.hasVoted()) {
            throw new IllegalArgumentException("You've already voted");
        }

        Candidates candidate = findCandidate(candidateID);
        candidate.incrementVote();
        voter.markAsVoted();
    }

    public void displayResults() {
        System.out.println("Election Results:");
        for (Candidates candidate : candidates) {
            System.out.println(candidate.getName() + " - Votes: " + candidate.getVoteCount());
        }
    }
}
