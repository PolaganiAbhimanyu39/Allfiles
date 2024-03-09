def fib(n):
    if n in fibtable.keys():
        return (fibtable[n])
    if n==0 or n==1:
        return n
    else:
        value=fib(n-1)+fib(n-2)
    fibtable[n]=value
    return(value)
fibtable={}
res=fib(5)
print(res)