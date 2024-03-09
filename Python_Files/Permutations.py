def Perm(arr,n):
    if n==1:
        return(arr)
    else:
        for i in range(n):
            arr[0],arr[i]=arr[i],arr[0]
            Perm(arr,n-i)
mylist=[]
size=int(input("Enter size of array: "))
for i in range(size):
    mylist.append(int(input(f"Enter {i+1} element of array: ")))
Perm(mylist,len(mylist))