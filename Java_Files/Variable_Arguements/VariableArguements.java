class VariableArguements{
    static void varagstest(int ...arr){
        System.out.print("Number of args: "+arr.length+" Contents: ");
        for(int x: arr)
            System.out.print(x+" ");
            System.out.println();
    }
        public static void main(String args[]){
            varagstest();
            varagstest(1,2,3);
            varagstest(10);
    }
}