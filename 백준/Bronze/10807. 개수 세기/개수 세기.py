count = int(input())
numList = list(map(int, input().split()))
findNum = int(input())

resultCount = 0

for i in range(count):
    if numList[i]==findNum :
        resultCount= resultCount + 1
    else :
        pass
    
print(resultCount)