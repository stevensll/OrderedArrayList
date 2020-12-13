import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{

    public NoNullArrayList(){
        super();
    }

    public NoNullArrayList(int initCap){
        super(initCap);
    }
    public boolean add(T element){
        if(element == null) throw new IllegalArgumentException("cannot add null");
        return super.add(element);
    }
    public void add(int index, T element){
        if(element == null) throw new IllegalArgumentException("cannot add null to index " + index);
        super.add(index, element);
    }
    public T set(int index, T element){
        if(element == null) throw new IllegalArgumentException("cannot add null to index " + index);
        return super.set(index,element);
    }
}