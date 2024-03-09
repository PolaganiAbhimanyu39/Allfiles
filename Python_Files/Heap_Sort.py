from Randomize_the_pivot_for_Quicksort import randomize
def heapify(arr,n,i):
    # Initialize largest as root
    largest=i 
    left=2*i+1
    right=2*i+2
    # If left child exists and is larger than root.
    if left<n and arr[left]>arr[largest]:
        largest=left
    # If right child exists and is larger than largest.
    if right<n and arr[right]>arr[largest]:
        largest=right
    # Change root if needed
    if largest!=i:
        # Swap
        arr[i],arr[largest]=arr[largest],arr[i]
        heapify(arr,n,largest) # We'll check from bottom to top
def heapsort(arr):
    n=len(arr)
    # Build a maxheap
    for i in range(n//2-1,-1,-1):
        heapify(arr,n,i) # We'll check from bottom to top
    # Extract elements one by one
    print(arr)
    for i in range(n-1,0,-1):
        # Swap
        arr[i],arr[0]=arr[0],arr[i]
        # Now, we check from top to bottom of tree.
        heapify(arr,i,0) 
mylist=[i for i in range(100,0,-1)]
randomize(mylist)
heapsort(mylist)
print(mylist)