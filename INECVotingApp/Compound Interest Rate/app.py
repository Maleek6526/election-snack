def calculate_compound_interest(principal, rate, time, frequency):
    rate_in_float = rate / 100
    amount = principal * (1 + (rate_in_float / frequency)) ** (frequency * time)
    return amount

def main():
    principal = float(input("Enter the principal amount : "))
    rate = float(input("Enter the annual interest rate : "))
    time = float(input("Enter the time in years : "))
    frequency = int(input("Enter the compounding frequency : "))
    amount = calculate_compound_interest(principal, rate, time, frequency)
    print(f"The final amount after {time:.2f} years is: {amount:,.2f}")

if __name__ == "__main__":
    main()
