list1=[1,2,3,4,5]
list2 = list1
# In the above assignment list1 and list2 share the same value.
print(list2)
list1[0]=7
print(list2)
# change in list1 is shown in list2 this shows that
#list1 and list2 share the value.