import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{

    public NoNullArrayList(){
        super();
    }

    public NoNullArrayList(int size){
        super(size);
    }
    public boolean add(T element){
        if(element == null) throw new IllegalArgumentException("cannot add null");
        super.add(element);
        return true;
    }
    public void add(int index, T element){
        if(element == null) throw new IllegalArgumentException("cannot add null to index " + index);
        super.add(index, element);
    }
    public T set(int index, T element){
        if(element == null) throw new IllegalArgumentException("cannot add null to index " + index);
        T e = this.get(index); 
        super.set(index,element);
        return e;
    }
}