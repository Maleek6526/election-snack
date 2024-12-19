from Candidates import Candidates

from Voters import Voters

class INEC:
    def __init__(self):
        self.voters = []
        self.candidates = []
        self.candidate_counter = 0
        self.voters_counter = 0

    def add_candidates(self, first_name, last_name, pincode, candidate_age):
        full_name = f"{first_name} {last_name}"
        candidate_id = self.candidate_counter + 1
        self.candidate_counter += 1
        new_candidate = Candidates(full_name, candidate_id, candidate_age, pincode, 0)
        self.candidates.append(new_candidate)

    def add_voters(self, first_name, last_name, pincode, voters_age):
        full_name = f"{first_name} {last_name}"
        voter_id = self.voters_counter + 1
        self.voters_counter += 1
        new_voter = Voters(full_name, voter_id, voters_age)
        self.voters.append(new_voter)

    def get_total_candidates(self):
        return len(self.candidates)

    def get_total_voters(self):
        return len(self.voters)

    def find_candidate(self, candidate_id):
        for candidate in self.candidates:
            if candidate.get_candidate_id() == candidate_id:
                return candidate
        raise ValueError("Candidate ID not found")

    def find_voter(self, voter_id):
        for voter in self.voters:
            if voter.get_voters_id() == voter_id:
                return voter
        raise ValueError("Voter ID not found")

    def cast_vote(self, voter_id, candidate_id):
        voter = self.find_voter(voter_id)

        if voter.has_voted:
            raise ValueError("You've already voted")

        candidate = self.find_candidate(candidate_id)
        candidate.increment_vote()
        voter.mark_as_voted()

    def display_results(self):
        print("Election Results:")
        for candidate in self.candidates:
            print(f"{candidate.get_name()} - Votes: {candidate.get_vote_count()}")
