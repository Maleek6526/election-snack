class INEC {
    constructor() {
        this.voters = [];
        this.candidates = [];
        this.candidateCounter = 0;
        this.votersCounter = 0;
    }

    addCandidates(firstName, lastName, pincode, candidateAge) {
        const fullName = `${firstName} ${lastName}`;
        const candidateId = ++this.candidateCounter;
        const newCandidate = new Candidates(fullName, candidateId, candidateAge, pincode, 0);
        this.candidates.push(newCandidate);
    }

    addVoters(firstName, lastName, votersAge) {
        const fullName = `${firstName} ${lastName}`;
        const votersID = ++this.votersCounter;
        const newVoter = new Voters(fullName, votersID, votersAge);
        this.voters.push(newVoter);
    }

    getTotalCandidates() {
        return this.candidates.length;
    }

    getTotalVoters() {
        return this.voters.length;
    }

    findCandidate(candidateID) {
        const candidate = this.candidates.find(candidate => candidate.getCandidateID() === candidateID);
        if (!candidate) {
            throw new Error("Candidate ID not found");
        }
        return candidate;
    }

    findVoter(votersID) {
        const voter = this.voters.find(voter => voter.getVotersID() === votersID);
        if (!voter) {
            throw new Error("Voter ID not found");
        }
        return voter;
    }

    castVote(votersID, candidateID) {
        const voter = this.findVoter(votersID);

        if (voter.hasVoted()) {
            throw new Error("You've already voted");
        }

        const candidate = this.findCandidate(candidateID);
        candidate.incrementVote();
        voter.markAsVoted();
    }

    displayResults() {
        console.log("Election Results:");
        this.candidates.forEach(candidate => {
            console.log(`${candidate.getName()} - Votes: ${candidate.getVoteCount()}`);
        });
    }
}