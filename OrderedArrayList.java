public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
    public OrderedArrayList(){
        super();
    }
    public OrderedArrayList(int initCap){
        super(initCap);
    }
    public boolean add(T element){
        //System.out.println(getSortIndex(element) + "for" + element);
        super.add(getSortIndex(element), element);
        return true;
    }
    public void add(int index, T element){
        super.add(getSortIndex(element), element);
    }
    public T set(int index, T element){
        T removed = super.get(index);
        super.remove(index); 
        this.add(element);
        return removed;
    }

    public int getSortIndex(T element ){
        if(element == null) throw new IllegalArgumentException("cannot sort null"); 
        int index = 0;
        if (this.size() > 0){ 
            for(int i  = 0; i < super.size(); i++){
                if(element.compareTo(super.get(i))>0) index = i+1;
            }
        }
        return index;
    }
}