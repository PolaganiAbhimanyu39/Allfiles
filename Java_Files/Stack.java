public class Stack{
    int top = -1;
    char[] Stack = new char[20];
    void push(char x){
        Stack[++top]=x;
    }
    int pop(){
        return(Stack[top--]);
    }
}