class Car
  def initialize(make, model)
    @make = make
    @model = model
  end

  def display_info
    "Make: #{@make}, Model: #{@model}"
  end
end

my_car = Car.new("Toyota", "Corolla")
puts my_car.display_info  # Output: Make: Toyota, Model: Corolla
