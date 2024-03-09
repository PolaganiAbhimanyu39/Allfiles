def QuickSort(A,l,r): # r must be len(A)
    if r-l<=1:
        return()
    yellow=l+1
    for green in range(l+1,r):
        if A[green]<=A[l]:
            (A[green],A[yellow])=(A[yellow],A[green])
            yellow=yellow+1
    (A[l],A[yellow-1])=(A[yellow-1],A[l])
    QuickSort(A,l,yellow-1)
    QuickSort(A,yellow,r)
