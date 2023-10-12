#
#n = 5
#for rows in range(n):
#    for column in range(rows+1):
#        print('*',end=' ')
#
#    print()
#
#
#
#for row in range(n):
#    for space in range(row+1):
#        print(' ',end=' ')
#    for afterpacenonextlinestar in range(row, n):  
#        print('*',end=' ')
#
#    print()
#
#for row in range(n):
#    for space in range(row, n):
#        print(' ',end=' ')
#    for afterpacenonextlinestar in range(row+1):  
#        print('*',end=' ')
#
#    print()
#
#
#for row in range(n):
#    for space in range(row, n):
#        print(' ',end=' ')
#    for triangle in range(row):
#        print('*',end=' ')
#    for afterpacenonextlinestar in range(row+1):  
#        print('*',end=' ')
#
#    print()
#
#for row in range(n):
#    for space in range(row, n):
#        print(' ',end=' ')
#    for triangle in range(row+1):
#        print('*',end=' ')
#    for trying in range(5):
#        print('',end=' ')
#    for afterpacenonextlinestar in range(row, n):  
#        print('*',end=' ')
#
#    print()
#
#

for row in range(n):
    for space in range(row+1):
        print(' ',end=' ')

    for decStar in range(row, n-1):
        print('*',end=' ')
    for decStar2 in range(row, n):
        print('*',end=' ')

    print()

























