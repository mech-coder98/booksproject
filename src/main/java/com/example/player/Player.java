// Write your code here.
package com.example.player;

public class Player {

    private int playerId;
    private String playerName;
    private int jersyNumber;
    private String role;

    public Player(int playerId, String playerName, int jersyNumber, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jersyNumber = jersyNumber;
        this.role = role;
    }

    public int getplayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getplayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getjersyNumber() {
        return jersyNumber;
    }

    public void setjersyNumber(int jersyNumber) {
        this.jersyNumber = jersyNumber;
    }

    public String getrole() {
        return role;
    }

    public void setPlayerId(String role) {
        this.role = role;
    }
}