class Stack {
    private int stck[] = new int[10];
    private int top,i;
    Stack(){
        top=-1;
    }
    void push(int item){
        if (top==9) 
        System.out.println("Stack is full");
        else{
            stck[++top]=item;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
        return(stck[top--]);
        }
    }
    void display(){
        for(i=0;i<stck.length;i++){
            System.out.println(stck[i]+" ");
        }
    }
    public static void main(String args[]){
        Stack mystack = new Stack();
        mystack.push(25);
        mystack.push(99);
        mystack.pop();
        mystack.display();
    }
    }
        
    

