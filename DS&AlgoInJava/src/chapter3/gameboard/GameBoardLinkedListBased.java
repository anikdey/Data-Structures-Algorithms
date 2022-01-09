package chapter3.gameboard;

public class GameBoardLinkedListBased {

    private Node head;
    private int size = 0;


    public void addScore(GameEntry entry) {
        if(isEmpty()) {
            head = new Node(entry, null);
        } else if(head.gameEntry.getScore()<entry.getScore()) {
            head = new Node(entry, head);
        } else {
            Node temp = head;
            Node prev = null;
            while (temp != null && temp.gameEntry.getScore()>entry.getScore()) {
                prev = temp;
                temp = temp.next;
            }
            if(prev.next == null) {
                prev.next = new Node(entry, null);
            } else {
                prev.next = new Node(entry, temp);
            }
        }
        size++;
    }

    public void printGameBoard() {
        if(isEmpty()) {
            System.out.println("Currently the board is empty");
            return;
        }
        System.out.println("Current standings ");
        Node temp = head;
        int counter = 1;
        while (temp != null) {
            GameEntry gameEntry = temp.gameEntry;
            System.out.println((counter+". Name: "+gameEntry.getName()+", Score: "+gameEntry.getScore()));
            counter++;
            temp = temp.next;
        }
        System.out.println("=====================");
    }

    public GameEntry remove(int index) {
        GameEntry entry;
        if(index<0 || isEmpty() || index>size) {
            System.out.println("No score is bound to that index");
            return null;
        }
        if(index == 0) {
            entry = head.gameEntry;
            head = head.next;
        } else {
            int count = 0;
            Node temp = head;
            Node prev = null;
            while (count != index-1) {
                prev = temp;
                temp = temp.next;
                count++;
            }
            entry = temp.gameEntry;
            prev.next = temp.next;
        }
        size--;
        return entry;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private static GameEntry getEntryObject(String name, int score) {
        return new GameEntry(name, score);
    }



    private class Node {
        GameEntry gameEntry;
        Node next;

        Node(GameEntry gameEntry, Node next) {
            this.gameEntry = gameEntry;
            this.next = next;
        }

    }


    public static void main(String[] args) {
        GameBoardLinkedListBased gm = new GameBoardLinkedListBased();
        gm.printGameBoard();
        gm.addScore(getEntryObject("Player 1", 10));
        gm.printGameBoard();
        gm.addScore(getEntryObject("Player 2", 20));
        gm.printGameBoard();
        gm.addScore(getEntryObject("Player 3", 30));
        gm.addScore(getEntryObject("Player 4", 40));
        gm.addScore(getEntryObject("Player 5", 50));
        gm.addScore(getEntryObject("Player 6", 51));
        gm.printGameBoard();

        int index = 5;
        System.out.println("After removing at index "+ index);
        gm.remove(index);
        gm.printGameBoard();
    }

}
