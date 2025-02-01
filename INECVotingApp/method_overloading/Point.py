class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"{self.x}, {self.y}"

    def __add__(self, other):
        return Point(self.x + other.x, self.y + other.y)

    def __sub__(self, other):
        return Point(self.x - other.x, self.y - other.y)

    def __mul__(self, other):
        return Point(self.x * other.x, self.y * other.y)
    def __truediv__(self, other):
        return Point(self.x / other.x, self.y / other.y)

e1 = Point(50,50)
e2 = Point(10,10)
print(e1 - e2)