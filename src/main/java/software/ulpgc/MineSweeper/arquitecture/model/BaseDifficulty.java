package software.ulpgc.MineSweeper.arquitecture.model;

public enum BaseDifficulty implements Difficulty {

    EASY(8, 8, 10),
    MEDIUM(16, 16, 40),
    HARD(16, 31, 99);

    private final int rows;
    private final int columns;
    private final int mineCount;

    BaseDifficulty(int rows, int columns, int mineCount) {
        this.rows = rows;
        this.columns = columns;
        this.mineCount = mineCount;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getMineCount() {
        return mineCount;
    }

}
