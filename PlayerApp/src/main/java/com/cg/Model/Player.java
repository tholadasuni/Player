package com.cg.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import nonapi.io.github.classgraph.json.Id;

@Document(collection = "Player")
public class Player {
	@Id 
	int playerId;

	String playerName;

	String email;

	Long mobile;

	float runRate;

	public Player() {
		super();
	}

	public Player(int playerId, String playerName, String email, Long mobile, float runRate) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.email = email;
		this.mobile = mobile;
		this.runRate = runRate;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public float getRunRate() {
		return runRate;
	}

	public void setRunRate(float runRate) {
		this.runRate = runRate;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", email=" + email + ", mobile=" + mobile
				+ ", runRate=" + runRate + "]";
	}

}
