def Students(fp):
    contents=fp.readlines()
    for line in contents:
        while line!="Grades\n":
            mydict[line.split("~")[0]]=line.split("~")[1]
def Courses(fp):
        for line in fp.readlines():
            if line=="Students\n":
                return Students(fp)
mydict={}
fp=open("Week-5.txt","r")
contents=fp.readlines()
for line in contents:
    if line=="Courses\n":
        Courses(fp)
        break
print(mydict)