matrix1=[[1,2,3],
         [4,5,6],
         [7,8,9]]
matrix2=[[1,2,3],
         [4,5,6],
         [7,8,9]]
matrix3=[[0 for k in range(len(matrix2[0]))]for i in range(len(matrix1))]
for i in range(len(matrix3)):
    for j in range(len(matrix3[0])):
        matrix3[i][j]=matrix1[i][j]+matrix2[i][j]
print("Matrix3 is as follows:")
for i in range(len(matrix3)):
    for k in range(len(matrix3[0])):
        print(matrix3[i][k],end=" ")
    print()