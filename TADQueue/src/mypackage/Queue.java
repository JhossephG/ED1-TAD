package mypackage;
public class Queue<T> {
private LSENode<T> beginning;
private LSENode<T> end;

    public boolean isEmpty(){
        if(this.beginning== null){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        return false;
    }

    public void enQueue(T value){
        LSENode<T> newe= new LSENode(value);
            if(this.isEmpty()== true){
                this.beginning= newe;
                this.end= newe;
            }
            else{
                this.end.setNext(newe);
                this.end= newe;
            }
    }

    public T deQueue(){
        LSENode<T> aux= this.beginning;
            if(this.beginning==end){
                this.beginning= null;
                this.end= null;
            }
            else{
                this.beginning= this.beginning.getNext();
            }
            return aux.getInfo();
    }

    public T head(){
        return this.beginning.getInfo();
    }
}
