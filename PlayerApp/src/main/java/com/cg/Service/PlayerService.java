package com.cg.Service;

import java.util.List;

import com.cg.Exceptions.PlayerNotFoundException;
import com.cg.Model.Player;

public interface PlayerService {
	public Player addPlayer(Player player);

	public List<Player>  displayAllPlayers();

	public Player updatePlayer(int playerId, Player player) throws PlayerNotFoundException;

	public void deletePlayer(int palyerId);

}
