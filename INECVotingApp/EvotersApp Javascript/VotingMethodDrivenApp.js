const prompt = require('prompt-sync')({ sigint: true });

class VotingMethodDrivenApp {
    constructor() {
        this.inec = new INEC();
    }

    main() {
        this.display();
    }

    display() {
        const mainMenu = `
            ===== INEC Voting System =====
                -> 1. Add Candidate
                -> 2. Add Voter
                -> 3. Cast Vote
                -> 4. Display Results
                -> 5. Exit
        `;
        console.log(mainMenu);

        const choice = parseInt(prompt("Enter your choice: "));
        switch (choice) {
            case 1:
                this.addCandidate();
                break;
            case 2:
                this.addVoter();
                break;
            case 3:
                this.castVote();
                break;
            case 4:
                this.displayResults();
                break;
            case 5:
                this.exit();
                break;
            default:
                console.log("Invalid choice. Please try again.");
                this.display();
        }
    }

    addCandidate() {
        const firstName = prompt("Enter candidate's first name: ");
        const lastName = prompt("Enter candidate's last name: ");
        const pincode = prompt("Enter candidate's pincode: ");
        const age = parseInt(prompt("Enter candidate's age: "));

        try {
            this.inec.addCandidates(firstName, lastName, pincode, age);
            console.log("Candidate added successfully.");
            this.display();
        } catch (e) {
            console.log(`Error: ${e.message}`);
            this.addCandidate();
        }
    }

    addVoter() {
        const firstName = prompt("Enter voter's first name: ");
        const lastName = prompt("Enter voter's last name: ");
        const age = parseInt(prompt("Enter voter's age: "));

        try {
            this.inec.addVoters(firstName, lastName, "", age);
            console.log("Voter added successfully.");
            this.display();
        } catch (e) {
            console.log(`Error: ${e.message}`);
            this.addVoter();
        }
    }

    castVote() {
        const voterID = parseInt(prompt("Enter your Voter ID: "));
        const candidateID = parseInt(prompt("Enter the Candidate ID you want to vote for: "));

        try {
            this.inec.castVote(voterID, candidateID);
            console.log("Vote cast successfully.");
            this.display();
        } catch (e) {
            console.log(`Error: ${e.message}`);
            this.castVote();
        }
    }

    displayResults() {
        console.log("Election Results:");
        this.inec.displayResults();
        this.display();
    }

    exit() {
        console.log("===== Thanks for using my app =====");
    }
}

const app = new VotingMethodDrivenApp();
app.main();