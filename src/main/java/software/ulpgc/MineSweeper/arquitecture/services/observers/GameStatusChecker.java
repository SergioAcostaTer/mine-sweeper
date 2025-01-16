package software.ulpgc.MineSweeper.arquitecture.services.observers;

import software.ulpgc.MineSweeper.arquitecture.control.BoardPresenter;
import software.ulpgc.MineSweeper.arquitecture.model.Game;
import software.ulpgc.MineSweeper.arquitecture.model.GameStatus;
import software.ulpgc.MineSweeper.arquitecture.model.Board;
import software.ulpgc.MineSweeper.arquitecture.model.Cell;
import software.ulpgc.MineSweeper.arquitecture.control.Observer;

public class GameStatusChecker implements Observer {
    private final BoardPresenter boardPresenter;
    private final int revealedCells = 0;

    public GameStatusChecker(BoardPresenter boardPresenter) {
        this.boardPresenter = boardPresenter;
    }

    @Override
    public void notify(Cell cell) {
        checkStatus(cell);
    }

    private void checkStatus(Cell cell) {
        if (isLoseCondition(cell)){
            boardPresenter.updateGameStatusChecker(GameStatus.Lose);
        } else if (isWinCondition(cell)){
            boardPresenter.updateGameStatusChecker(GameStatus.Win);
        }
    }

    public boolean isLoseCondition(Cell cell){
        return cell.hasMine();
    }

    public boolean isWinCondition(Cell cell){
        return true;
    }
}
