# you dont know how hppy i am to actually get this chap3 question so it say 
# the sum of the suared or the two side must be equals to the thrid side the hypotenues eg 3, 4, 5
#so 3 square + 4 square = 9+16 = 25 which is 5 square
#so i think i will make a triple loop
#or 5, 12, 13 = 25+114 = 169 =13square
limit = 20
for side1 in range(1, limit+1):
    for side2 in range(1, limit+1):
        for hypo in range(1, limit+1):
#            print(f'side 1: {side1}, side 2: {side2}, side 3: {hypo}')
            if side1 ** 2 + side2 **2 == hypo **2:

                print(f'we found our tripolololo {side1}, {side2}, {hypo}')
            
