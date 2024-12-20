const INEC = require('./INEC');
const Voters = require('./Voters');
const Candidates = require('./Candidates');

describe('INEC Voting App Tests', () => {
    test('Should add a new voter', () => {
        const inec = new INEC();
        inec.addVoters('hassan', 'ope', '12345', 25);
        expect(inec.getTotalVoters()).toBe(1);

        const voter = inec.findVoter(1);
        expect(voter.getVotersFullName()).toBe('hassan ope');
        expect(voter.getVotersAge()).toBe(25);
    });

    test('Should add a new candidate', () => {
        const inec = new INEC();
        inec.addCandidates('bolu', 'yoyo', '67890', 45);
        expect(inec.getTotalCandidates()).toBe(1);

        const candidate = inec.findCandidate(1);
        expect(candidate.getName()).toBe('bolu yoyo');
        expect(candidate.getCandidateAge()).toBe(45);
    });

    test('Voters should be able to cast a vote', () => {
        const inec = new INEC();
        inec.addVoters('hassan', 'ope', '12345', 25);
        inec.addCandidates('bolu', 'yoyo', '67890', 45);

        const voter = inec.findVoter(1);
        voter.castVote(inec, 1);

        const candidate = inec.findCandidate(1);
        expect(candidate.getVoteCount()).toBe(1);
    });

    test('Voters should not vote twice', () => {
        const inec = new INEC();
        inec.addVoters('hassan', 'ope', '12345', 25);
        inec.addCandidates('bolu', 'yoyo', '67890', 45);

        const voter = inec.findVoter(1);
        voter.castVote(inec, 1);

        expect(() => {
            voter.castVote(inec, 1);
        }).toThrow('You\'ve already voted');
    });

    test('Candidate not found should throw error', () => {
        const inec = new INEC();
        inec.addCandidates('bolu', 'yoyo', '67890', 45);

        expect(() => {
            inec.findCandidate(99);
        }).toThrow('Candidate ID not found');
    });

    test('Voter not found should throw error', () => {
        const inec = new INEC();
        inec.addVoters('ere', 'pull', '12345', 25);

        expect(() => {
            inec.findVoter(99);
        }).toThrow('Voter ID not found');
    });

    test('Should display results correctly', () => {
        const inec = new INEC();
        inec.addVoters('ewa', 'rice', '12345', 25);
        inec.addVoters('pomo', 'chicken', '67890', 30);
        inec.addCandidates('rate', 'queen', '54321', 45);
        inec.addCandidates('christ', 'pope', '98765', 50);

        const voter1 = inec.findVoter(1);
        voter1.castVote(inec, 1);

        const voter2 = inec.findVoter(2);
        voter2.castVote(inec, 2);

        const candidate1 = inec.findCandidate(1);
        const candidate2 = inec.findCandidate(2);

        expect(candidate1.getVoteCount()).toBe(1);
        expect(candidate2.getVoteCount()).toBe(1);
    });
});