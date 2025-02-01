package NewVotersApp;

public class AppUserInterface {
    public static void main(String[] args) {
        Users user1 = new Users(1, "John Doe", "password123");
        Candidates candidate1 = new Candidates(1, "Alice");
        Candidates candidate2 = new Candidates(2, "Bob");

        Elections election = new Elections(1, "Presidential Election 2024");

        Votes vote = new Votes(user1.getUserId(), candidate1.getCandidateId());
        System.out.println("Vote cast by user " + user1.getName() + " for candidate " + candidate1.getName());
    }
}
