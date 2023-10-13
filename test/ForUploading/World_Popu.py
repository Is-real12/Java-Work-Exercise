current_pop = 8000000000

pop = current_pop
growth_Rate = 0.083

print(f'years\t\tTotal Increase\t\tincrease Number\n')

calculation_percent  = 0
for year in range(1, 101):
    calculation_percent += pop * growth_Rate 
    pop += calculation_percent
    

    print(f'{year:>5,}\t\t{pop:>5,}\t\t{calculation_percent:>5,}', end=' ')

    print()
