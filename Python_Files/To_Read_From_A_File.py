file=open("NPTEL/text.txt","r")
text="abcdefghijklmnopqrstuvwxyz"
mydict={}
mydict["spl"]=0
content=file.readlines()
for line in content:
    for letter in line:
        if letter not in text:
            mydict["spl"]+=1
        elif letter.lower() not in mydict:
            mydict[letter.lower()]=1
        else:
            mydict[letter.lower()]+=1
print(mydict)