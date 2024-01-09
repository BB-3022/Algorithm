A, B, C = map(int, input().split())

# 세 값이 동일 할 경우
if A == B == C :
    print(10000+A*1000)

# 중복값이 있을 경우
elif A == B or B == C or A ==C :
    print(1000+A*100) if A == B else print(1000+C*100)

# 값이 전부 다를 경우
else :
    print(max(A,B,C)*100)
    
    