package NewVotersApp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

        @Test
        public void testUserCreation() {
            Users user = new Users(1, "John Doe", "password123");
            assertEquals(1, user.getUserId());
            assertEquals("John Doe", user.getName());
            assertEquals("password123", user.getPassword());
        }

        @Test
        public void testCandidateCreation() {
            Candidates candidate = new Candidates(1, "Alice");
            assertEquals(1, candidate.getCandidateId());
            assertEquals("Alice", candidate.getName());
        }

        @Test
        public void testElectionCreation() {
            Elections election = new Elections(1, "Presidential Election 2024");
            assertEquals(1, election.getElectionId());
            assertEquals("Presidential Election 2024", election.getTitle());
        }

        @Test
        public void testVoteCasting() {
            Votes vote = new Votes(1, 1);
            assertEquals(1, vote.getUserId());
            assertEquals(1, vote.getCandidateId());
        }
    }
