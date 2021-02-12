public class List<T> {
    private volatile ListEl<T> head;

    public ListEl<T> getHead() {return head;}

    public void setHead(ListEl<T> head) {this.head = head;}

    public List(){
        head = null;
    }
}

class ListEl<T>{
    T val;
    ListEl<T> next;

    ListEl(T v, ListEl<T> n){
        val = v;
        next = n;
    }
}
