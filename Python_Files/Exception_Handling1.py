mylist=[1,2,3]
try:
    print(mylist[0]/0)
except: # If not specified it works for every error.
    print("Error")
exce