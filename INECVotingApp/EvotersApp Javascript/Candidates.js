class Candidates {
    constructor(name, candidateID, candidateAge, pincode, voteCount) {
        if (candidateAge >= 40) {
            this.name = name;
            this.candidateID = candidateID;
            this.candidateAge = candidateAge;
            this.pincode = pincode;
            this.voteCount = voteCount;
        } else {
            throw new Error("Candidate must be at least 40 years old");
        }
    }

    getName() {
        return this.name;
    }

    getCandidateAge() {
        return this.candidateAge;
    }

    getCandidateID() {
        return this.candidateID;
    }

    getVoteCount() {
        return this.voteCount;
    }

    incrementVote() {
        this.voteCount++;
    }

    validateCandidatePincode(pincode) {
        if (pincode !== this.pincode) {
            throw new Error("Invalid Pincode");
        }
    }
}
module.exports = Candidates;