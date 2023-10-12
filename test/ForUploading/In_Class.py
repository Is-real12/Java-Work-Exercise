#def fibonacci(number):
#    number1 = ' ' 
#
#    for i in range(number):
#        number += 'fizzbuzz'
#
#    return number1
#
#result = fibonacci(8)
#print(result)
#
#
#function
#
#the parameter without default arg have to come first before the params-= with default meaning  'placement'
#and you can also use keyword argument to maipulate the placement whaen calling the func
#for unlimited params use loop to loop throught the parameter  without the range it will work but it wont allow an untilimited values i the args so for that you put *numbers <--
#
#
#
#
#for i in range(row+1):
#    print('*',end=' ')
#    print()
#
#
#
#
#
#   ows  the looping values to be iterables and can be looped through
# 
#n = 5
#
#for row in range(n):
#    for i in range(row+1):
#        print(' ',end=' ')
#    for i in range(row, n-1):
#        print('*',end=' ')
#    for i in range(row, n):
#        print('*',end=' ')
#    print()
#
#n1 = 5
#for row in range(n1):
#    for i in range(row, n1):
#        print(' ',end=' ')
#    for i in range(row):
#        print('*',end=' ')
#    print()
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#for row in range(n):
#    for i in range(row, n):
#        print(' ',end=' ')
#    for i in range(1):
#        print('*',end=' ')
#    for i in range(5):
#        print('*',end=' ')
#
#
#    print()


#num = 10 
#
#divi = num ** 0.50
#print(divi)
#
#def divisibl_or_square(number):
#
#    
#    square = number ** 0.50
#
#        
#
#        
#    if number %  5 == 0:
#       return square
#       
#
#    else:
#       
#        return square
#
#
#
#result = divisibl_or_square(10)
#print(f'{result:.2f}')
#
#
#


#num = 4
#
#
#if num == 4:
#    print(num)
#
#else:
#    print('not')
#


for i in range(1, 51):
    if i %3 == 0 and i %5 == 0:
        print('fizzBuzz')
    elif i %3 == 0:
        print('fizz')

    elif i %5 == 0:
        print('buzz')

    else:
        print(i)












