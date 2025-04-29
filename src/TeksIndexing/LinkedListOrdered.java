package TeksIndexing;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOrdered <E> extends LinkedList <E>{
    public boolean addSort(E e){
        ListIterator<E> iterator =this.listIterator();
        while (iterator.hasNext()){
            E temp = iterator().next();;
            if(((Comparable)temp).compareTo(e)>0){
                return true;
            }
        }
        iterator.add(e);
        return true;
    }
    public E get (E e){
        ListIterator<E>iterator=this.listIterator();
        while (iterator.hasNext()){
            E temp = iterator.next();
            if(((Comparable)temp).compareTo(e)==0){
                return temp;
            }
        }
        return null;
    }
    public String toString(){
        String temp="";
        ListIterator<E> iterator=this.listIterator();
        while (iterator.hasNext()){
            temp =temp + iterator.next()+" ";
        }
        return temp;
    }

}
