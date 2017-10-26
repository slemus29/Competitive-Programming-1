cases = int(input())
for c in range(cases):
    entry = list(map(int, input().split(' ')))
    p = (entry[0], entry[1])
    q = (entry[2], entry[3])
    qMinusP = (q[0] - p[0], q[1] - p[1])
    r = (q[0] + qMinusP[0], q[1] + qMinusP[1])
    print(str(r[0]) + " " + str(r[1]))