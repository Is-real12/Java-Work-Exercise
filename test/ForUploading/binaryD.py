number = '1101'

power = 0

the_addition = 0
#for digit in reversed(number):
#
#    print(digit)

#reversed_number = number[::-1]   #using plindrom approach
#
#for digit in reversed_number:
#
#    toInt = int(digit)
#
#    the_addition +=toInt *(2**power)
#    power+=1
#
#    print(the_addition)
#


#or you can use the manual palindrom approach which is 
num = int(input('enter a num: '))
reversed_num = 0
original = num

while num != 0:
    digit = num % 10
#    print(digit)
    reversed_num = reversed_num *10+digit
 
    num//=10

to_Str = str(num)
in_Expo = 0
power = 0

to_s = str(reversed_num)
for digit in to_s:
    toInt = int(digit)
    in_Expo += toInt * (2 **power)
    power+=1
print(in_Expo)
   









#num = 100012
#num1 = num //10 %10
#print(num1)
#num//=10
#print(num)
