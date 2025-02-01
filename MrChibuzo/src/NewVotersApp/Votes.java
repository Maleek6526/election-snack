package NewVotersApp;

public class Votes {
    private int userId;
    private int candidateId;

    public Votes(int userId, int candidateId) {
        this.userId = userId;
        this.candidateId = candidateId;
    }
    public int getUserId(){
       return userId;
    }
    public int getCandidateId(){
        return candidateId;
    }
}