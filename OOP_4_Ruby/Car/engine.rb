class Engine
  def start
    "Engine started"
  end
end

class Car
  def initialize
    @engine = Engine.new
  end

  def start
    @engine.start
  end
end

my_car = Car.new
puts my_car.start  # Output: Engine started
