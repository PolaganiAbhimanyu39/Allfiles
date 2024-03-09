def findpos(l,v):
    for i in range(len(l)):
        if l[i]==v:
            pos=i
            break
    else:# This will be executed when loop ends naturally without executing "break" keyword.
        pos=-1
    return pos
l=[1,2,3,4]
res=findpos(l,5)
print(res)