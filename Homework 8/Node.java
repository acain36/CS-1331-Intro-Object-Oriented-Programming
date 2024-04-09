/**
* This class takes in a generic type parameter for the type of data the Node will hold.
* @author Ashley Cain
* @version 1.0
* @since   2021-04-25
* @param <T> is the generic type for this class
*/
public class Node<T> {
    private T data;
    private Node<T> next;

    /**
    * This method will set the data and Node for the Object.
    * @param data is data stored in the Node
    * @param next is the Node that comes next in the list
    */
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
    * This method will set the data and Node for the Object.
    * @param data is data stored in the Node
    */
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    /**
    * This method will return the data of type T generic.
    * @return data which is the data type stored in the Node
    */
    public T getData() {
        return this.data;
    }

    /**
    * This method will return the next Node in the list.
    * @return next which is the Node that comes next in the list
    */
    public Node<T> getNext() {
        return this.next;
    }

    /**
    * This method will set the data for the Object.
    * @param data is data stored in the Node
    */
    public void setData(T data) {
        this.data = data;
    }

    /**
    * This method will set the next Node for the Object.
    * @param next is the next Node that comes in the list
    */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}