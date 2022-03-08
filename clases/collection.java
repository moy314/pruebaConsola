package clases;

public interface collection <T> {
    

    //next
    //buscar indica,eliminar,contiene
    //getters setters
    //vaciar
    //agregar
    //to string
    // is empty
    //cabza
    //longitud
    //constructor( con parametros,sin paremetros)
    //equals
    //iterador
    //reverse
    //clone
     //append



     public void add(T elemento);
     public boolean delete(T object);
     public int size();
     public void append(collection<T> elemento);
     public boolean equeals(collection<T> object);
     public void tostring();
     public boolean isEmpty();
     public T pop();
    //public void sort(Comparator c); 
     public boolean contains(T elemento);
     public collection<T> clone();
     
     
     
     






}
