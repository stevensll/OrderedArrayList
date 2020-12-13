public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
    public OrderedArrayList(){
        super();
    }
    public OrderedArrayList(int size){
        super(size);
    }
    public boolean add(T element){
        super.add(getSortIndex(element), element);
        return true;
    }
    public void add(int index, T element){
        super.add(getSortIndex(element), element);
    }
    public T set(int index, T element){
        T removed = super.get(index);
        super.remove(index); 
        super.add(getSortIndex(element), element);
        return removed;
    }

    public int getSortIndex(T element ){
        int index = 0;
        for(int i  = 0; i < this.size()-1; i++){
            if(element.compareTo(this.get(index+1))>0) index++;
        }
        return index;
    }
    

}
