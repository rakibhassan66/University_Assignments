module Flyable
  def fly
    "Flying!"
  end
end

class Bird
  include Flyable
end

sparrow = Bird.new
puts sparrow.fly  # Output: Flying!
