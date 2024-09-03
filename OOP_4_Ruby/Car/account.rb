class Account
  def initialize(balance)
    @balance = balance
  end

  def deposit(amount)
    @balance += amount
  end

  def display_balance
    "Balance: #{@balance}"
  end

  private

  def withdraw(amount)
    @balance -= amount
  end
end

account = Account.new(1000)
account.deposit(500)
puts account.display_balance  # Output: Balance: 1500
# account.withdraw(200)  # This will raise an error because withdraw is private
