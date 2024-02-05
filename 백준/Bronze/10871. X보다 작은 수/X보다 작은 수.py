A, B = map(int, input().split())
num = list(map(int,input().split()))
result = []

for i in num :
    if B > i :
        print(i, end=" ")
