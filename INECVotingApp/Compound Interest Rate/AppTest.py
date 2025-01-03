import unittest
from app import calculate_compound_interest

class TestCompoundInterest(unittest.TestCase):
    def test_annual_compounding(self):
        result = calculate_compound_interest(1000, 5, 1, 1)
        self.assertAlmostEqual(result, 1050.0, 2)

    def test_monthly_compounding(self):
        result = calculate_compound_interest(300000, 5, 5, 12)
        self.assertAlmostEqual(result, 385007.60, 2)

    def test_quarterly_compounding(self):
        result = calculate_compound_interest(2000, 3, 10, 4)
        self.assertAlmostEqual(result, 2696.70, 2)

    def test_no_time(self):
        result = calculate_compound_interest(1000, 5, 0, 1)
        self.assertAlmostEqual(result, 1000.0, 2)

    def test_zero_interest_rate(self):
        result = calculate_compound_interest(5000, 0, 5, 12)
        self.assertAlmostEqual(result, 5000.0, 2)
