package chapter3.gameboard;

public class GameBoardArrayBased {

    private GameEntry[] gameEntries = null;
    private int capacity = 0;
    private int currentPosition = -1;

    public GameBoardArrayBased(int capacity) {
        this.capacity = capacity;
        gameEntries = new GameEntry[capacity];
    }

    public void addScore(GameEntry entry) {
        if(currentPosition<capacity-1 || gameEntries[currentPosition].getScore()<entry.getScore()) {
            if(currentPosition<capacity-1)
                currentPosition++;
            int tempPos = currentPosition;
            while (tempPos>0 && gameEntries[tempPos-1].getScore()<entry.getScore()){
                gameEntries[tempPos] = gameEntries[tempPos-1];
                tempPos--;
            }
            gameEntries[tempPos] = entry;
        }
    }

    public GameEntry removeScore(int index) {
        GameEntry entry;
        if(index<0 || index>currentPosition) {
            System.out.println("No score is bound to that index");
            return null;
        }

        entry = gameEntries[index];
        while (index<currentPosition) {
            gameEntries[index] = gameEntries[index+1];
            index++;
        }
        gameEntries[currentPosition] = null;
        currentPosition--;
        return entry;
    }

    public void printGameBoard() {
        if(currentPosition<0){
            System.out.println("Board is empty");
            return;
        }
        System.out.println("Current standings ");
        for(int i=0; i<=currentPosition; i++) {
            GameEntry gameEntry = gameEntries[i];
            System.out.println((i+1)+". Name: "+gameEntry.getName()+", Score: "+gameEntry.getScore());
        }
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        GameBoardArrayBased gm = new GameBoardArrayBased(5);
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
        int index = -1;
        System.out.println("After removing at index "+ index);
        gm.removeScore(index);
        gm.printGameBoard();
    }

    private static GameEntry getEntryObject(String name, int score) {
        return new GameEntry(name, score);
    }

}
