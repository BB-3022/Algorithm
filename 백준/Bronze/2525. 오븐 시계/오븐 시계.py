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

# 코드 리팩토링
H, M = map(int, input().split())
U = int(input())

totalM = (H * 60 + M + U) % 1440  # 총 소요 시간을 24시간(1440분)으로 나눈 나머지를 구함
resultH = totalM // 60
resultM = totalM % 60

print(resultH, resultM)
