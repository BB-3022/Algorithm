num = list(map(int, input().split()))

# 세 값이 동일 할 경우
if num[0] == num[1] == num[2] :
    print(10000+num[0]*1000)

# 세 값이 모두 다를 경우
elif num[0] != num[1] and num[1] != num[2] and num[0] != num[2] :
    print(max(num) * 100)

# 중복 값이 있을 경우 (List Comprehension 사용)
else :
    result = [value for value in num if num.count(value) == 2][0]
    print(1000 + result * 100)
    
    