mydict={}
def Students():
    n=input()
    while n!="Grades":
        mydict[n.split("~")[0]]=n.split("~")[1]
def Courses():
    n=input()
    while True:
        n=input()
        if n=="Students":
            Students()
n=input()
if n=="Courses":
    Students()
print(mydict)