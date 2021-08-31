package com.projetos.circularList;

public class CircularList<T> {

    private CircularNode<T> head;
    private CircularNode<T> tail;
    private int listSize;

    public CircularList(){
        this.tail = null;
        this.head = null;
        this.listSize = 0;
    }

    public void add(T content){
        CircularNode<T> newNode = new CircularNode<>(content);
        if (this.listSize == 0){
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(tail);
        } else {
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }
        this.listSize++;
    }

    public void remove(int index){
        if (index >= this.listSize)
            throw new IndexOutOfBoundsException("Index is bigger than the list size!");

        CircularNode<T> auxNode = this.tail;
        if (index == 0){
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(this.tail);
        } else if (index == 1){
            this.tail.setNextNode(this.tail.getNextNode().getNextNode());
        } else {
            for (int i = 0; i < index-1; i++) {
                auxNode = auxNode.getNextNode();
            }
            auxNode.setNextNode(auxNode.getNextNode().getNextNode());
        }
        this.listSize--;
    }


    public T get(int index){
        return this.getNode(index).getContent();
    }

    private CircularNode<T> getNode(int index){
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("This is list is empty!");

        if (index == 0){
            return this.tail;
        }

        CircularNode<T> auxNode = this.tail;
        for (int i = 0; i < index; i++) {
            auxNode = auxNode.getNextNode();
        }
        return auxNode;
    }

    public boolean isEmpty(){
        return this.listSize == 0 ? true : false;
    }

    public int size(){
        return this.listSize;
    }

    @Override
    public String toString() {
        String returnStr = "";
        CircularNode<T> auxNode = this.tail;
        for (int i = 0; i < this.size(); i++) {
            returnStr += "[Node{content=" + auxNode.getContent() + "}]--->";
            auxNode = auxNode.getNextNode();
        }
        returnStr += this.size() != 0 ? "(return to tail)" : "[]";
        return returnStr;
    }
}
