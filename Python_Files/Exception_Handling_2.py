while True:
    try:
        x=input("Enter x value: ")
        break      #"break" will be excuted only when above line doesn't give  ValueError.
        y=int(input("Enter x value: ")) 
    except ValueError:
        pass  #We don't want to do anything even when we have an exception 

print(f"value of x and y are {x},{y}")