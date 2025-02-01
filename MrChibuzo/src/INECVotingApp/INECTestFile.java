package INECVotingApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class INECTestFile {
        @Test
        public void testThatICanAddNewVoter() {
            INEC inec = new INEC();
            inec.addVoters("hassan", "ope", "12345", 25);
            assertEquals(1, inec.getTotalVoters());

            Voters voter = inec.findVoter(1);
            assertEquals("hassan ope", voter.getVotersFullName());
            assertEquals(25, voter.getVotersAge());
        }

        @Test
        public void testThatICanAddCandidate() {
            INEC inec = new INEC();
            inec.addCandidates("bolu", "yoyo", "67890", 45);
            assertEquals(1, inec.getTotalCandidates());

            Candidates candidate = inec.findCandidate(1);
            assertEquals("bolu yoyo", candidate.getName());
            assertEquals(45, candidate.getCandidateAge());
        }

        @Test
        public void testThatVotersCanCastVote() {
            INEC inec = new INEC();
            inec.addVoters("hassan", "ope", "12345", 25);
            inec.addCandidates("bolu", "yoyo", "67890", 45);

            Voters voter = inec.findVoter(1);
            voter.castVote(inec, 1);

            Candidates candidate = inec.findCandidate(1);
            assertEquals(1, candidate.getVoteCount());
        }

        @Test
        public void testThatOneVoterCannotVoteTwice() {
            INEC inec = new INEC();
            inec.addVoters("hassan", "ope", "12345", 25);
            inec.addCandidates("bolu", "yoyo", "67890", 45);

            Voters voter = inec.findVoter(1);
            voter.castVote(inec, 1);

            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
                voter.castVote(inec, 1);
            });
            assertEquals("You've already voted", exception.getMessage());
        }

        @Test
        public void testCandidateMightNotBeFound() {
            INEC inec = new INEC();
            inec.addCandidates("bolu", "yoyo", "67890", 45);

            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
                inec.findCandidate(99);
            });
            assertEquals("Candidate ID not found", exception.getMessage());
        }

        @Test
        public void testThatVoterMightNotBeFound() {
            INEC inec = new INEC();
            inec.addVoters("ere", "pull", "12345", 25);

            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
                inec.findVoter(99);
            });
            assertEquals("Voter ID not found", exception.getMessage());
        }

        @Test
        public void testDisplayResults() {
            INEC inec = new INEC();
            inec.addVoters("ewa", "rice", "12345", 25);
            inec.addVoters("pomo", "chicken", "67890", 30);
            inec.addCandidates("rate", "queen", "54321", 45);
            inec.addCandidates("christ", "pope", "98765", 50);

            Voters voter1 = inec.findVoter(1);
            voter1.castVote(inec, 1);

            Voters voter2 = inec.findVoter(2);
            voter2.castVote(inec, 2);

            Candidates candidate1 = inec.findCandidate(1);
            Candidates candidate2 = inec.findCandidate(2);

            assertEquals(1, candidate1.getVoteCount());
            assertEquals(1, candidate2.getVoteCount());
        }
    }
