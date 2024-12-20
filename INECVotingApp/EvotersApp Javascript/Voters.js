class Voters {
    constructor(name, votersID, votersAge) {
        if (votersAge >= 18) {
            this.name = name;
            this.votersID = votersID;
            this.votersAge = votersAge;
            this.hasVoted = false;
        } else {
            throw new Error("You must be more than 18 years old to vote");
        }
    }

    getVotersFullName() {
        return this.name;
    }

    getVotersID() {
        return this.votersID;
    }

    getVotersAge() {
        return this.votersAge;
    }

    hasVoted() {
        return this.hasVoted;
    }

    markAsVoted() {
        this.hasVoted = true;
    }

    castVote(inec, candidateID) {
        inec.castVote(this.votersID, candidateID);
    }
}
module.exports = Voters;