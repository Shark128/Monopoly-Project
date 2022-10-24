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

    // Bryan & Carson
    public Player nextTurn(CircularLinkedList players){
        Link currentLink = players.firstLink;
        Player currentPlayer = (Player) firstLink.data;
        while(!players.isEmpty()){
            currentPlayer = (Player) currentLink.data;
            currentLink = currentLink.nextLink;
        }
        return currentPlayer;
    }
}
