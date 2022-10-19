public class CircularLinkedList {
    public Link firstLink;
    public Link lastLink;
    public CircularLinkedList () {firstLink = null; lastLink = null;}
    public void insertFirst (Link newLink) {
        if (isEmpty()) {
            firstLink = newLink;
            lastLink = newLink;
        }
        else {
            Link oldFirstLink = firstLink;
            firstLink = newLink;
            firstLink.nextLink = oldFirstLink;
            lastLink.nextLink = firstLink;
        }
    }
    public boolean isEmpty () {
        return firstLink == null;
    }

}
