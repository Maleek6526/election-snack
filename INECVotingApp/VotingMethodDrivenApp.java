package INECVotingApp;
import java.util.Scanner;

public class VotingMethodDrivenApp {

        private static INEC inec = new INEC();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            display();
        }
        public static void display(){
            String mainMenu = """
                    ===== INEC Voting System =====
                        -> 1. Add Candidate
                        -> 2. Add Voter
                        -> 3. Cast Vote
                        -> 4. Display Results
                        -> 5. Exit 
                    """;
            System.out.println(mainMenu);

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addCandidate();
                        break;
                    case 2:
                        addVoter();
                        break;
                    case 3:
                        castVote();
                        break;
                    case 4:
                        displayResults();
                        break;
                    case 5:
                        exit();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

    private static void addCandidate() {
            System.out.print("Enter candidate's first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter candidate's last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter candidate's pincode: ");
            String pincode = scanner.nextLine();
            System.out.print("Enter candidate's age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            try {
                inec.addCandidates(firstName, lastName, pincode, age);
                System.out.println("Candidate added successfully.");
                display();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                addCandidate();
            }
        }

        private static void addVoter() {
            System.out.print("Enter voter's first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter voter's last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter voter's age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            try {
                inec.addVoters(firstName, lastName, "", age);
                System.out.println("Voter added successfully.");
                display();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                addVoter();
            }
        }

        private static void castVote() {
            System.out.print("Enter your Voter ID: ");
            int voterID = scanner.nextInt();
            System.out.print("Enter the Candidate ID you want to vote for: ");
            int candidateID = scanner.nextInt();

            try {
                inec.castVote(voterID, candidateID);
                System.out.println("Vote cast successfully.");
                display();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                castVote();
            }
        }

        private static void displayResults() {
            System.out.println("Election Results:");
            inec.displayResults();
            display();
        }

    private static void exit() {
        String displayer = """
                    =====  Thanks for using my app =====
                    """;
        System.out.println(displayer);
    }
    }
