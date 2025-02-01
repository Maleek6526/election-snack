package E_votersApp;

public class Candidates {
    private String name;
    private int voteCount;
    public Candidates(String name){
        this.name = name;
        this.voteCount = 0;
    }

    public String getName(){
        return name;
    }
    public int getVoteCount(){
        return voteCount;
    }
    public void addVoteCount(){
        voteCount++;
    }
}
