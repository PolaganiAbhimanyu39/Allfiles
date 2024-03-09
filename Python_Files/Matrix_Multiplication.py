matrix1=[[1,2,3],[4,5,6],[7,8,9]]
matrix2=[[11,2,3],[4,5,6],[7,8,9]]
res=[[0 for k in range(len(matrix2[0]))] for i in range(len(matrix1))]
for i in range(len(matrix1)):
    for j in range(len(matrix2[0])):
        for k in range(len(matrix2)):
            res[i][j]=res[i][j]+matrix1[i][k]*matrix2[k][j]
for i in range(len(res)):
    for k in range(len(res[0])):
        print(res[i][k],end=" ")
    print()
