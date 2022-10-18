package mypackage;
public class LSENode<T> {
private T info;
private LSENode<T> next;
    
    public LSENode(T value){
        this.info= value;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public LSENode<T> getNext() {
        return next;
    }

    public void setNext(LSENode<T> prox) {
        this.next = next;
    }
    
}