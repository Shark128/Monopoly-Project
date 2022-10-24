public class CircularLinkedList { // Written by Carson, Shreyes, and Bryan
    public Link firstLink;
    public Link lastLink;
    public CircularLinkedList () {firstLink = null; lastLink = null;}
    //Checks if nothing is in the circular linked list
    public boolean isEmpty () {
        return firstLink == null;
    }
    //Inserts a new link at the start of the list
    public void insertFirst (Link newLink) {
        if (isEmpty()) { firstLink = newLink; lastLink = newLink;}
        else {
            Link oldFirstLink = firstLink;
            firstLink = newLink; //newLink becomes first link and its nextLink is the oldFirstLink
            firstLink.nextLink = oldFirstLink;
            lastLink.nextLink = firstLink; //Sets the last link's nextLink to the newLink, creating a circular linked list
        }
    }

    // Written by Carson
    public void rotatePlayers(){ // The turn belongs to whichever player is first.
        if (firstLink != lastLink) { // Must have more than 1 player for turns to rotate
            if (firstLink.nextLink == lastLink) { // Special case if there is only two players in the list.
                Link tempLink = firstLink;
                firstLink = lastLink;
                lastLink = tempLink;
                firstLink.nextLink = lastLink;
                lastLink.nextLink = firstLink;
            }
            else{
                Link tempLink = firstLink;
                firstLink = lastLink;
                lastLink = tempLink;
                lastLink.nextLink = firstLink;
            }
        }
    }
}
