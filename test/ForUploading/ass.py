#def food(n):
#n=5
#for row in range(n):
#    for i in range(row):
#        print('*',end=' ')
#    print()
#for row in range(n):
#    for i in range(row, n):
#        print('*',end=' ')
#    print()
#
#
#

def format_function(picture):
    formatted_picture = ''
    for i in picture:
        for j in i:
            if j == 1:
                formatted_picture+='*'
            elif j == 0:
                formatted_picture+=' '
    
        formatted_picture+='\n'

    return formatted_picture

picture = [
    [0, 0, 0, 1, 0, 0, 0],
    [0, 0, 1, 1, 1, 0, 0],
    [0, 1, 1, 1, 1, 1, 0],
    [1, 1, 1, 1, 1, 1, 1],
    [0, 0, 0, 1, 0, 0, 0],
    [0, 0, 0, 1, 0, 0, 0],
    [0, 0, 0, 1, 0, 0, 0],
    [0, 0, 0, 1, 0, 0, 0]
]

formatted_picture = format_function(picture)
print(formatted_picture)





#
#
#def fizz(start, end):
#    result =''
#    for i in range(start, end + 1):
#        if i %5 and i %3 ==0:
#            result+= 'FizzBuzz'
#        elif i %3 ==0:
#           result+='fizz'
#
#        elif i %5 ==0:
#          result+='buzz'
#        
#        else:
#            result+=f'{i}'
#        result+='\n'
#
#    return result
#
#result = fizz(1, 50)
#print (result)
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
