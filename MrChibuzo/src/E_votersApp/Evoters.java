package E_votersApp;

import java.util.ArrayList;

public class Evoters {
    private ArrayList <Candidates> candidate;
    private int counter = 0;

    public Evoters(){
        candidate = new ArrayList<>();
    }

    public void addCandidate(String name) {
        candidate.add(new Candidates(name));
        this.counter++;
    }

    public int getCounter(){
        return counter;
    }

    public boolean voteForCandidate(String candidateName, int votersAge) {
        if (votersAge >= 18) {
            for (Candidates candidate : candidate) {
                if (candidate.getName().equalsIgnoreCase(candidateName)) {
                    candidate.addVoteCount();
                    return true;
                }
            }
        }
        return false;
    }

    public void voteResults() {
        for (Candidates candidate : candidate) {
            System.out.println(candidate.getName() + ": " + candidate.getVoteCount() + " votes");
        }
    }
}
