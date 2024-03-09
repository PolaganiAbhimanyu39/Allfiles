pairs = [ (x,y) for x in range(6,1,-1) for y in range(3,1,-1) if (x+y)%2 == 0 ]
print(pairs)
"""pairs = []: This initializes an empty list named pairs where we will store the tuples of (x, y) that satisfy the given conditions.
for x in range(6, 1, -1): This loop iterates over the values of x starting from 6 down to 2 (inclusive). The range() function generates a sequence of numbers in the specified range with the specified step (-1 in this case).
for y in range(3, 1, -1): For each value of x from the outer loop, this loop iterates over the values of y starting from 3 down to 2 (inclusive), again with a step of -1.
if (x + y) % 2 == 0: This is a condition that checks if the sum of x and y is an even number (i.e., divisible by 2). If this condition is met, the tuple (x, y) is added to the pairs list.
So, let's go through a couple of iterations to see which pairs satisfy the conditions:
When x = 6 and y = 3, (x + y) equals 9, which is odd. So, this pair is not added to the pairs list.
When x = 6 and y = 2, (x + y) equals 8, which is even. So, (6, 2) is added to the pairs list.
When x = 5 and y = 3, (x + y) equals 8, which is even. So, (5, 3) is added to the pairs list.
When x = 5 and y = 2, (x + y) equals 7, which is odd. So, this pair is not added to the pairs list.
When x = 4 and y = 3, (x + y) equals 7, which is odd. So, this pair is not added to the pairs list.
When x = 4 and y = 2, (x + y) equals 6, which is even. So, (4, 2) is added to the pairs list.
When x = 3 and y = 3, (x + y) equals 6, which is even. So, (3, 3) is added to the pairs list.
When x = 3 and y = 2, (x + y) equals 5, which is odd. So, this pair is not added to the pairs list.
When x = 2 and y = 3, (x + y) equals 5, which is odd. So, this pair is not added to the pairs list.
When x = 2 and y = 2, (x + y) equals 4, which is even. So, (2, 2) is added to the pairs list.
After going through all the possible combinations, the pairs list will contain the tuples (6, 2), (5, 3), (4, 2), (3, 3), and (2, 2)."""