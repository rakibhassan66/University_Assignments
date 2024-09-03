class Animal
  def speak
    "Some generic animal sound"
  end
end

class Dog < Animal
  def speak
    "Woof!"
  end
end

class Cat < Animal
  def speak
    "Meow!"
  end
end

def make_animal_speak(animal)
  puts animal.speak
end

dog = Dog.new
cat = Cat.new

make_animal_speak(dog)  # Output: Woof!
make_animal_speak(cat)  # Output: Meow!
