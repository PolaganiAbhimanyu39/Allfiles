def finder(wt,val,W,n):
    if W==0 or n==0:
        return 0
    elif wt[n-1]<=W:
        return(max(val[n-1]+finder(wt,val,W-wt[n-1],n-1),finder(wt,val,W,n-1)))
    elif wt[n-1]>W:
        return finder(wt,val,W,n-1)
weights=[2,4,6,8]
val=[4,8,3,5]
n=4
W=10
res=finder(weights,val,W,n)
print(res)