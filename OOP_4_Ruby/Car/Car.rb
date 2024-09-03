require_relative '../Vehicle'  # Adjust the path as necessary
class Car < Vehicle
  def start_engine
    "Engine started!"
  end
end

my_car = Car.new("Toyota", "Corolla")
puts my_car.details         # Output: This vehicle is a Toyota Corolla.
puts my_car.start_engine    # Output: Engine started!