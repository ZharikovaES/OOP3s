package ru.mirea;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Class WaitList.
 * @author Zharikova Ekaterina.
 * @param <E> Type of stored data.
 * @see IWaitList
 * @version 1.0
 * {@link WaitList#content}
 */
public class WaitList<E> implements IWaitList<E> {
    /**
     * Field for storing data
     */
    protected ConcurrentLinkedQueue<E> content;
    /**
     * Constructor - creating new object with empty data queue.
     * @see WaitList#WaitList(Collection)
     */
    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }
    /**
     * Constructor - creating new object with data from some collection.
     * @param c Collection with data to store.
     * @see WaitList#WaitList()
     */
    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<>(c);
    }
    /**
     * Method to get information about this list in String type.
     * @return String-value of this list.
     */
    @Override
    public String toString() {
        return "WaitList: content = " + content;
    }
    /**
     * Method to add element at the end of queue.
     * @param element Value to be added.
     * @see IWaitList#add(Object)
     * @see ConcurrentLinkedQueue#add(Object)
     */
    @Override
    public void add(E element){
        content.add(element);
    }
    /**
     * Method to remove first element of the queue.
     * @return Removed element.
     * @throws IllegalStateException {@link WaitList#content} is empty.
     * @see IWaitList#remove()
     * @see ConcurrentLinkedQueue#remove()
     */
    @Override
    public E remove() {
        return content.remove();
    }
    /**
     * Method to check, is value equal to element in queue.
     * @param element Value for search.
     * @return True - element find, false - not find.
     * @see IWaitList#contains(Object)
     */
    @Override
    public boolean contains(E element){
        return content.contains(element);
    }
    /**
     * Method to check, are all values equal to elements of collection in queue.
     * @param c Collection with values for search.
     * @return True - founded all elements, false - some element was not found.
     * @see IWaitList#containsAll(Collection)
     */
    @Override
    public boolean containsAll(Collection<E> c){
        return content.containsAll(c);
    }
    /**
     * Method to check, is {@link WaitList#content} empty.
     * @return True - {@link WaitList#content} has no elements, false - no any element in it.
     * @see IWaitList#isEmpty()
     * @see ConcurrentLinkedQueue#isEmpty()
     */
    @Override
    public boolean isEmpty(){
        return content.isEmpty();
    }

}
