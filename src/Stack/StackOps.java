package Stack;

public class StackOps {
    int arr[]=new int[5];
    int top=0;
    public void push(int data){
        if(top==arr.length){
            System.out.println("Stack is full");
            return;
        }
        arr[top]=data;
        top++;
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        int data=arr[top];
        arr[top]=0;
        top--;

    }
    public void display(){
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
