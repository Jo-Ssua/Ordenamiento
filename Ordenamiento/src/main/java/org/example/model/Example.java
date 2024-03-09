package org.example.model;

public class Example {


    private Nodo first;
    private Nodo last;
    private int size;

    public Example(){
        first=null;
        last=null;
    }

    public void addNode(int dato){
        Nodo temp = new Nodo(dato);

        if(first == null){
            first = temp;
            last = first;
            first.setPrev(null);
            size++;
        }else{
            temp.setPrev(last);
            last.setNext(temp);
            last = temp;
            last.setNext(null);
            if(first.getNext() == null){
                first.setNext(last);
            }
            size++;

        }





    }



    public void selectionSort() {
        if (first == null) {
            return;
        }

        Nodo current = first;
        while (current != null) {
            Nodo minNode = current;
            Nodo temp = current.getNext();
            while (temp != null) {
                if (temp.getDato() < minNode.getDato()){
                    minNode = temp;
                }
                temp = temp.getNext();
            }

            int tempData = current.getDato();
            current.setDato(minNode.getDato());
            minNode.setDato(tempData);

            current = current.getNext();
        }
    }

    public void insertionSort() {

        // El ciclo de afuera sirve para recorrer cada elemento de la lista
        // El ciclo de adentro sirve para encontrar el menor, compara

        while (first != null) {

            Nodo minor = first;
            Nodo current = first.getNext();

            while (current != null && current.getNext().getDato() != current.getDato()) {

                if (current.compareTo(minor) == -1) {

                    minor.setNext(current.getNext());
                    current.setNext(minor);
                    current.getNext().setPrev(minor);
                    current.setPrev(null);
                    minor.setPrev(current);

                }

            }

            minor = current;
            current = current.getNext();

        }

    }


    public void organizeNodes(int value){
        Nodo current = new Nodo (value);
        if(first!=null){
            if(first.getDato() >first.next.getDato()) {
                current = first;
                first.prev = first.next;
                first = first.next;
                current.next.next = current.next;
                first.next = current;
                first.prev = null;
                current.next.prev = current;
            }else{
                first.next = current;
                if(current.getDato()>current.next.getDato()){
                    current.prev.next=current.next;
                    current.next.prev = current.prev;
                    current.prev=current.next;
                    current.next.next = current;
                    if(current.next.next==null){
                        current.next=null;
                    }else{
                        current.next = current.next.next;
                    }

                }else{
                    current = current.next;
                }
            }

        }


    }





    public String printList(){
        String msg = "";
        Nodo current =first;
        while (current!= null){
            msg += "["+current.getDato()+"]";
            current = current.getNext();
        }

        return msg;
    }

    public void printReverse(){
        Nodo current =last;
        while (current!= null){
            System.out.print("["+current.getDato()+"]");
            current = current.getPrev();
        }

    }


}
