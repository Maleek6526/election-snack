class Voters:
    def __init__(self, name, voters_id, voters_age):
        if voters_age >= 18:
            self.name = name
            self.voters_id = voters_id
            self.voters_age = voters_age
            self.has_voted = False
        else:
            raise ValueError("You must be more than 18 years old to vote")

    def get_voters_full_name(self):
        return self.name

    def get_voters_id(self):
        return self.voters_id

    def get_voters_age(self):
        return self.voters_age

    def has_voted(self):
        return self.has_voted

    def mark_as_voted(self):
        self.has_voted = True

    def cast_vote(self, inec, candidate_id):
        inec.cast_vote(self.voters_id, candidate_id)
