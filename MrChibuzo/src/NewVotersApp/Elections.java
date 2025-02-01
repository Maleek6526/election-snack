package NewVotersApp;

public class Elections {
    private int electionId;
    private String title;

    public Elections(int electionId, String title) {
        this.electionId = electionId;
        this.title = title;
    }
    public int getElectionId(){
        return electionId;
    }
    public String getTitle(){
       return title;
    }
}
