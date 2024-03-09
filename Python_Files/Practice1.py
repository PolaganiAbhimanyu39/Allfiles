def BS(arr,v):
    mid=len(arr)//2
    if len(arr)==1 and arr[0]!=v:
        print("Element not found")
        return()
    if arr[mid]==v:
        return mid
    elif v<arr[mid]:
        return(BS(arr[:mid],v))
    elif v>arr[mid]:
        return(BS(arr[mid:],v))
mylist=[i for i in range(101)]
res=BS(mylist,66)
print(res)
