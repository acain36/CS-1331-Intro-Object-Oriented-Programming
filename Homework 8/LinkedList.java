import java.util.Iterator;
import java.util.NoSuchElementException;
/**
* This class takes in a generic type parameter for the type of data the Node will hold.
* @author Ashley Cain
* @version 1.0
* @since   2021-04-25
* @param <T> is the generic type for this class
*/
public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private int size;

    /**
    * Sets the head and size to null and zero respectively.
    */
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
    * Inserts a Node with the passed-in data at the passed-in index in this list, if the index is valid.
    * @param index - index at which the data is to be inserted
    * @param data - data to be inserted
    */
    @Override
    public void add(int index, T data) {
        if (index < 0 || index > (this.size + 1)) {
            throw new IllegalArgumentException();
        } else if (index == 0) {
            head = new Node<T>(data, head);
            this.size++;
        } else {
            int number = 0;
            Node<T> current = head;
            Node<T> holder = new Node<T>(data, null);
            while (current != null) {
                if (index - 1 == number) {
                    holder.setNext(current.getNext());
                    current.setNext(holder);
                    this.size++;
                    return;
                } else {
                    number++;
                    current = current.getNext();
                }
            }
        }
    }

    /**
    * This method will return the Node of type T generic.
    * @return head which is the first Node
    */
    public Node<T> getHead() throws IllegalArgumentException, IndexOutOfBoundsException {
        return this.head;
    }

    /**
    * This method will size of the LinkedList.
    * @return size which is the size
    */
    public int getSize() throws IllegalArgumentException, IndexOutOfBoundsException {
        return this.size;
    }

    /**
    * Appends a Node with the passed-in data to the end of this list.
    * @param data - data to be appended to this list
    */
    @Override
    public void add(T data) {
        Node<T> temp = new Node<T>(data);
        Node<T> headTemp = head;
        if (isEmpty()) {
            head = temp;
        } else {
            while (headTemp.getNext() != null) {
                headTemp = headTemp.getNext();
            }
            headTemp.setNext(temp);
        }
    }

    /**
    * Returns the data at the passed-in index in this list, if the index is valid.
    * @param index - the index of the data to be retreived
    * @return the data at the passed-in index
    */
    @Override
    public T get(int index) throws IllegalArgumentException, IndexOutOfBoundsException {
        Node<T> headTemp = null;
        if (index < 0) {
            return null;
        }
        if (this.head != null) {
            headTemp = this.head.getNext();
            for (int i = 0; i < index; i++) {
                if (headTemp.getNext() == null) {
                    return null;
                }
                headTemp = headTemp.getNext();
            }
            return headTemp.getData();
        }
        return headTemp.getData();

    }

    /**
    * Returns true if this list contains no elements.
    * @return true if this list contains no elements, otherwise false
    */
    //@Override
    public boolean isEmpty() {
        if (size != 0) {
            return false;
        }
        return true;
    }

    /**
    * Removes all of the elements from this list.
    */
    @Override
    public void clear() throws IllegalArgumentException, IndexOutOfBoundsException {
        Node<T> headTemp = this.head.getNext();
        while (headTemp != head) {
            Node<T> next = headTemp.getNext();
            headTemp.setNext(null);
            headTemp = null;
            headTemp = next;
        }
        size = 0;
    }

    /**
    * Returns an iterator over the elements in this list in proper sequence.
    * @return an iterator over the elements in this list in proper sequence
    */
    @Override
    public Iterator<T> iterator() {
        LinkedListIterator iterator = new LinkedListIterator();
        return iterator;
    }

    /**
    * This is the iterator method.
    */
    public class LinkedListIterator implements Iterator<T> {
        private Node<T> nextNode;

        /**
        * Method sets the nextNode.
        * @param nextNode sets the nextNode
        */
        public void setNextNode(Node<T> nextNode) {
            this.nextNode = nextNode;
        }

        /**
        * Method gets the nextNode.
        * @return the nextNode
        */
        public Node<T> getNextNode() {
            return this.nextNode;
        }

        /**
        * This will set the nextNode variable to the head.
        */
        public LinkedListIterator() {
            nextNode = head;
        }

        /**
        * Gets the nextNode in the Linked List.
        * @return the data from a node of type T.
        */
        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("element not found");
            }
            nextNode = nextNode.getNext();
            return nextNode.getData();
        }

        /**
        * This method will see if there is a next node.
        * @return a boolean telling whether it does have a next node
        */
        public boolean hasNext() {
            if (nextNode.getNext() == null) {
                return false;
            }
            return true;
        }
    }
}
