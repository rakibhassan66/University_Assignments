def add(name):
    return f"Hello, little brat {name}"

print(add("Shakil"))

def adder(a, b):
    return a + b, a - b, a / b

res = adder(4, 6)

# Unpacking the result for individual formatting
sum_res, diff_res, div_res = res

print("The results are: sum = {}, difference = {}, division = {:.1f}".format(sum_res, diff_res, div_res))
