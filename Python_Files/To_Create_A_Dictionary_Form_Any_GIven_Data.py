mylist=[1,2,3,4,5,6,7,8,91,2,3,4,5,6,7]
mydict={}
for i in mylist:
    if i in mydict:
        mydict[i]+=1
    else:
        mydict[i]=1
print(mydict)
pprint(mylist)