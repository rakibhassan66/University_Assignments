class Vehicle
  def initialize(make)
    @make = make
  end

  def display_make
    "Make: #{@make}"
  end
end

class Car < Vehicle
  def initialize(make, model)
    super(make)  # Calls the initialize method of Vehicle
    @model = model
  end

  def display_info
    "#{display_make}, Model: #{@model}"
  end
end

my_car = Car.new("Honda", "Civic")
puts my_car.display_info  # Output: Make: Honda, Model: Civic
