f1=open("file1.txt","r")
f2=open("file3.txt","w")
for line in f1.readlines():
    f2.write(line)
f1.close()
f2.close()