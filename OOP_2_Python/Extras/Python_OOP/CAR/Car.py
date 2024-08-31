
class Car:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year
        
    def info(self):
        print(f"Car name: {self.make}, model: {self.model}, from {self.year}")
