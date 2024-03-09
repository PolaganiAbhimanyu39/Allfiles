# Find maximum and minimum elements of the list.
list=[1,2,3,4,5,6,7,8,9,10]
max=list[0]
min=list[0]
for i in list:
    if i>max:
        max=i
    elif i<min:
        min=i
print(max)
print(min)