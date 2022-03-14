public enum GameState {

    Player_is_Winner("Player is Win"),
    Player_Running("Game is continue");

    private String value;

    GameState(String s) {
        this.value = s;
    }


    public String getValue() {
        return value;
    }

}