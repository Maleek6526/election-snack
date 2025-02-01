package E_votersApp;

import java.util.Scanner;

public class VotersUserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Evoters votingApp = new Evoters();

        System.out.println("Welcome to my voting app");

        System.out.print("Enter the number of candidates: ");
        int numberOfCandidates = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfCandidates; i++) {
            System.out.print("Enter candidate " + (i + 1) + " name: ");
            String candidateName = scanner.nextLine();
            votingApp.addCandidate(candidateName);
        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if(age >= 18){
            System.out.println("Who is your preferred candidate: ");
            String votersCandidate = scanner.nextLine();
            scanner.nextLine();
            System.out.println("What is your age: ");
            int votersAge = scanner.nextInt();
            if (votingApp.voteForCandidate(votersCandidate, votersAge)) {
                System.out.println("Vote cast successfully!");
            } else {
                System.out.println("Candidate not found. Try again.");
            }
        }
        else{
            System.out.println("You must be at least 18 years old to vote.");
        }
        votingApp.voteResults();
    }
}
