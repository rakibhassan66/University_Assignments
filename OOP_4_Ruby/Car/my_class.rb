class MyClass
  define_method(:greet) do |name|
    "Hello, #{name}!"
  end
end

obj = MyClass.new
puts obj.greet("Alice")  # Output: Hello, Alice!
