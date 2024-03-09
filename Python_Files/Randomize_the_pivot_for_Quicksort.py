# randrange is used to select any number btw start and stop with step as gap btw start and stop
import random
def randomize(l):
    for i in range(len(l)//2):
        j=random.randrange(0,len(l),1) # (start,stop,step)
        k=random.randrange(0,len(l),1)
        (l[j],l[k])=(l[k],l[j])
