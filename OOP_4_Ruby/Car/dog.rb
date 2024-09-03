class Dog
  def bark
    "Woof!"
  end
end

class Cat
  def meow
    "Meow!"
  end
end

def make_sound(animal)
  animal.bark if animal.respond_to?(:bark)
  animal.meow if animal.respond_to?(:meow)
end

dog = Dog.new
cat = Cat.new

make_sound(dog)  # Output: Woof!
make_sound(cat)  # Output: Meow!
