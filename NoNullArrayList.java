import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{

    public NoNullArrayList(){
        super();
    }

    public boolean add(T element){
        if(element.equals(null)) throw new IllegalArgumentException("cannot add null");
        super.add(element);
        return true;
    }
    public void add(int index, T element){
        if(element.equals(null)) throw new IllegalArgumentException("cannot add null to index " + index);
        add(index, element);
    }
    public T set(int index, T element){
        if(element.equals(null)) throw new IllegalArgumentException("cannot add null to index " + index);
        T e = this.get(index); 
        super.set(index,element);
        return e;
    }
}