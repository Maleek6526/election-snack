from INEC import INEC
class VotingMethodDrivenApp:
    def __init__(self):
        self.inec = INEC()
        self.main_menu = """
            ===== INEC Voting System =====
                -> 1. Add Candidate
                -> 2. Add Voter
                -> 3. Cast Vote
                -> 4. Display Results
                -> 5. Exit 
        """

    def display(self):
        print(self.main_menu)
        try:
            choice = int(input("Enter your choice: "))
            match choice:
                case 1:
                    self.add_candidate()
                case 2:
                    self.add_voter()
                case 3:
                    self.cast_vote()
                case 4:
                    self.display_results()
                case 5:
                    self.exit()
                case _:
                    print("Invalid choice. Please try again.")
                    self.display()
        except ValueError:
            print("Invalid input. Please enter a correct number.")
            self.display()

    def add_candidate(self):
        try:
            first_name = input("Enter candidate's first name: ")
            last_name = input("Enter candidate's last name: ")
            pincode = input("Enter candidate's pincode: ")
            age = int(input("Enter candidate's age: "))
            self.inec.add_candidates(first_name, last_name, pincode, age)
            print("Candidate added successfully.")
            self.display()
        except ValueError:
            print("Invalid input. Age must be a number and it must be 40 0r greater than 40.")
            self.add_candidate()
        except Exception as e:
            print(f"Error: {e}")
            self.add_candidate()

    def add_voter(self):
        try:
            first_name = input("Enter voter's first name: ")
            last_name = input("Enter voter's last name: ")
            age = int(input("Enter voter's age: "))
            self.inec.add_voters(first_name, last_name, "", age)
            print("Voter added successfully.")
            self.display()
        except ValueError:
            print("Invalid input. Age must be a number and it must be 18 0r greater than 18.")
            self.add_voter()
        except Exception as e:
            print(f"Error: {e}")
            self.add_voter()

    def cast_vote(self):
        try:
            voter_id = int(input("Enter your Voter ID: "))
            candidate_id = int(input("Enter the Candidate ID you want to vote for: "))
            self.inec.cast_vote(voter_id, candidate_id)
            print("Vote cast successfully.")
            self.display()
        except ValueError:
            print("Invalid input. IDs must be numbers and check the ID again.")
            self.cast_vote()
        except Exception as e:
            print(f"Error: {e}")
            self.cast_vote()

    def display_results(self):
        print("Election Results:")
        self.inec.display_results()
        self.display()

    def exit(self):
        print("=====  Thanks for using my app =====")
        quit()


if __name__ == "__main__":
    app = VotingMethodDrivenApp()
    app.display()
