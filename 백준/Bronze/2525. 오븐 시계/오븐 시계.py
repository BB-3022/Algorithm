H, M = map(int, input().split())
U = int(input())

totalM = H * 60 + M + U

if totalM >= 1440 :
    totalM = totalM - 1440
    resultH = totalM//60
    resultM = totalM - (resultH * 60)
    print(resultH, resultM)
else :
    resultH = totalM//60
    resultM = totalM - (resultH * 60)
    print(resultH, resultM)