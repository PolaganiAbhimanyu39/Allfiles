import numpy as np
def bsearch(seq,v,l,r):
    if r-l==0:
        return(False)
    mid=(l+r)//2
    if v==seq[mid]:
        return True
    elif v>seq[mid]:
        return(bsearch(seq,v,mid+1,r))
    elif v<seq[mid]:
        return(bsearch(seq,v,l,mid))
s=list(range(2,1000,2))
k=np.array(s)
res=bsearch(k,1000,0,len(k)-1)
print(res)