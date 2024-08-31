class Triangle:
    def __init__(self,base,height):
        self.base = base
        self.height = height
    def calculate_area(self):
        print((f"The area of the triangle is {self}"),1/2*(self.base*self.height))