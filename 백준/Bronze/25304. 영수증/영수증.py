total = int(input())
category = int(input())
result = 0

for i in range(category):
    amount, count = map(int, input().split())
    result = (amount*count)+result

if total == result :
    print("Yes")
else :
    print("No")