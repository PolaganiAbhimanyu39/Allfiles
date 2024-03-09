while True:
    try:
        x=int(input("Enter x value: "))
    except ValueError:
        pass   
    else:    #When control does not enter "except" only then code in "else" will be executed. 
        break
print(f"value of x is {x}")