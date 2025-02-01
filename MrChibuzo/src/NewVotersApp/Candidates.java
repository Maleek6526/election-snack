package NewVotersApp;

public class Candidates {
    private int candidateId;
    private String name;

    public Candidates(int candidateId, String name) {
        this.candidateId = candidateId;
        this.name = name;
    }
    public int getCandidateId(){
        return candidateId;
    }
    public String getName(){
        return name;
    }
}
