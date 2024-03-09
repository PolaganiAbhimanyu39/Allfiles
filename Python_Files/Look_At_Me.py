mylist=[(1,2),(2,1),(0,5),(2,0)]
mylist.sort(key=lambda x: (x[0], x[1]))
print(mylist)