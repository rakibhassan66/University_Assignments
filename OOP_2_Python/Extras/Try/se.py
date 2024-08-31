
num = list(range(1, 11))

sq = [x**2 for x in num]
print(sq) 

ev = [x for x in num if x % 2 == 0]
print(ev)  

es = [x**2 for x in num if x % 2 == 0]
print(es) 