n = 5
for row in range(n):
    for i in range(row+1):
        print('*',end=' ')
    for s in range(row, n):
        print(' ',end=' ')
    
    for j in range(row, n):
        print('*',end=' ')
    for i in range(row+1):
        print(' ',end=' ')

    for s in range(row+1):
        print(' ',end=' ')

    for w in range(row, n):
        print('*',end=' ')
        
    for s in range(row, n):
        print(' ',end=' ')
    for t in range(row):
        print('*',end=' ')
    for r in range(row+1):
        print('*',end=' ')
    for l in range(row, n):
        print(' ',end=' ')

    for i in range(row+1):
        print(' ',end=' ')
    for i in range(row, n-1):
        print('*',end=' ')
    for i in range(row, n):
        print('*',end=' ')

    for s in range(row+1):
        print(' ',end=' ')
    for t in range(row+1):
        print('*',end=' ')
    for r in range(row, n):
        print('*',end=' ')

    print()
print()

for row in range(n-1):
    for l in range(row, n):
        print(' ',end=' ')
    for t in range(row):
        print('*',end=' ')
    for r in range(row+1):
        print('*',end=' ')
    print()

for row in range(n):
    for i in range(row+1):
        print(' ',end=' ')
    for i in range(row, n-1):
        print('*',end=' ')
    for i in range(row, n):
        print('*',end=' ')

    print()
print()

for row in range(n-1):
    for i in range(row+1):
        print('*',end=' ')
    print()
for row in range(n):
    for i in range(row, n):
        print('*',end=' ')
    print()






for row in range(n):
    for i in range(row, n):
        print(' ',end=' ')
    for i in range(1):
        print('*',end=' ')
    for i in range(5):
        print('*',end=' ')


    print()








