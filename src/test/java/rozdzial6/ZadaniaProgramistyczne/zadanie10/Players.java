package rozdzial6.ZadaniaProgramistyczne.zadanie10;

public class Players {

    String playerName;
    String computerName;
    int playerScore;
    int computerScore;

    public Players(){
        playerName = "";
        playerScore = 0;
        computerName = "";
        computerScore = 0;
    }

    public void setPlayerName(String n) {
        playerName = n;
    }

    public void setPlayerScore(int pScore) {
        playerScore = pScore;
    }

    public void setComputerName() {
        computerName = "Daryl";
    }

    public void setComputerScore(int cScore) {
        computerScore = cScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScoreScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public String getComputerName() {
        return computerName;
    }

}
