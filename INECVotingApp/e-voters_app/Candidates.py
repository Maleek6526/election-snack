class Candidates:
    def __init__(self, name, candidate_id, candidate_age, pincode, vote_count):
        if candidate_age >= 40:
            self.name = name
            self.candidate_id = candidate_id
            self.candidate_age = candidate_age
            self.pincode = pincode
            self.vote_count = vote_count
        else:
            raise ValueError("Candidate must be at least 40 years old")

    def get_name(self):
        return self.name

    def get_candidate_age(self):
        return self.candidate_age

    def get_candidate_id(self):
        return self.candidate_id

    def get_vote_count(self):
        return self.vote_count

    def increment_vote(self):
        self.vote_count += 1

    def validate_candidate_pincode(self, pincode):
        if pincode != self.pincode:
            raise ValueError("Invalid Pincode")
