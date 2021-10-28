public class Rules {
    public String whoWin(int playerMove, int computerMove, int argsLength) {
        if (playerMove == computerMove) {
            return "Draw";
        } else if (computerMove > playerMove && computerMove - playerMove > (argsLength / 2)){
            return "You win!";
        } else if (playerMove > computerMove && playerMove - computerMove < (argsLength / 2)){
            return "You win!";
        }
        return "Computer win";
    }
}