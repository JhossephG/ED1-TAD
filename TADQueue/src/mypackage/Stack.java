package mypackage;

public class Stack<T> {
private LSENode<T> top;

    public boolean isEmpty(){
        if(this.top== null){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(T value){
        LSENode newe= new LSENode<T>(value);
        newe.setNext(this.top);
        this.top= newe;
    }
    public boolean isFull(){
        return false;
    }
    public T pop(){
        LSENode<T> aux= this.top;
        this.top= this.top.getNext();
        return aux.getInfo();
    }
    public T top(){
        return this.top.getInfo();
    }


}
