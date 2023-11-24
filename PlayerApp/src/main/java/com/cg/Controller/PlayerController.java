package com.cg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Model.Player;
import com.cg.Service.PlayerServiceImpl;

@RestController
@RequestMapping("/player")
public class PlayerController {
	
	@Autowired
	PlayerServiceImpl playerimpl;

	@PostMapping("/addplayer")
	public Player addpplayer(@RequestBody Player player) {
		return playerimpl.addPlayer(player);

	}

	@GetMapping("/getallplayer")
	public List<Player> getallplayers() {
		return playerimpl.displayAllPlayers();
	}

	@PutMapping("/updateplayer/{playerId}")
	public Player updateplayer(@PathVariable int playerId, @RequestBody Player player) {
		return playerimpl.updatePlayer(playerId, player);

	}

	@DeleteMapping("/deleteplayer/{playerId}")
	public void deleteplayer(@PathVariable int playerId) {
		playerimpl.deletePlayer(playerId);
	}
}
