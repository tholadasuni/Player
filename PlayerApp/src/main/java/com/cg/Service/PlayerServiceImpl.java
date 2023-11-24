package com.cg.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Exceptions.PlayerNotFoundException;
import com.cg.Model.Player;
import com.cg.Repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	PlayerRepository Playerrepo;

	public Player addPlayer(Player p) {

		return Playerrepo.save(p);
	}

	public List<Player> displayAllPlayers() {

		return Playerrepo.findAll();

	}

	@Override
	public Player updatePlayer(int playerId, Player player) throws PlayerNotFoundException {

		Player updateplayer = Playerrepo.findById(playerId).orElseThrow(() -> new PlayerNotFoundException());

		updateplayer.setPlayerId(player.getPlayerId());
		updateplayer.setPlayerName(player.getPlayerName());
		updateplayer.setEmail(player.getEmail());
		updateplayer.setMobile(player.getMobile());

		final Player finalupdateplayer = Playerrepo.save(updateplayer);

		return finalupdateplayer;

	}

	@Override
	public void deletePlayer(int palyerId) throws PlayerNotFoundException {
		{

			if (Playerrepo.existsById(palyerId)) {
				Playerrepo.deleteById(palyerId);
			} else {
				throw new PlayerNotFoundException("PLAYER NOT EXISTS WITH ID " + palyerId);
			}
		}

	}

}
