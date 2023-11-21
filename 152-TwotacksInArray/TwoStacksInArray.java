class TwoStacks{
    int[] arr;
    int top1,top2,size;

    TwoStacks(int size){
        this.size=size;
        arr=new int[size];
        top1=-1;
        top2=size;
    }
    public void push1(int num){
        if(top1<top2-1){
            top1++;
            arr[top1]=num;
        }else{
            System.out.println("Stack Overflow");
        }        
    }
    public void push2(int num){
        if(top1<top2-1){
            top2--;
            arr[top2]=num;
        }else{
            System.out.println("Stack Overflow");
        }    
    }
    public int pop1(){ 
        if(top1>=0){
            return arr[top1--];
        }
        return 0;
    }
    public int pop2(){
        if(top2<size){
            return arr[top2++];
        }
        return 0;
    }
}
public class TwoStacksInArray {

    public static void main(String[] args) {
        TwoStacks stacks=new TwoStacks(5);

        stacks.push1(1);
        stacks.push1(2);
        stacks.push1(4);
        stacks.push2(3);
        stacks.push2(5);

        for(int i : stacks.arr){
            System.out.print(i+" ");
        }
        System.out.println("Popped element from stack one is: "+stacks.pop1());
        System.out.println("Popped element from stack two is: "+stacks.pop2());
    }
}
