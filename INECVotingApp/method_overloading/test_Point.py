from unittest import TestCase

from method_overloading.Point import Point


class TestPoint(TestCase):
    def test_Point1(self):
        e1 = Point(50, 50)
        e2 = Point(10, 10)
        expected = 60
        result = e1.x + e2.x
        self.assertEqual(expected, result)
