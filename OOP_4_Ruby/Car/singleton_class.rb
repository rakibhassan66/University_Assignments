class SingletonClass
  include Singleton

  def hello
    "Hello, Singleton!"
  end
end

instance = SingletonClass.instance
puts instance.hello  # Output: Hello, Singleton!
