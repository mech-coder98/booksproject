/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.

package com.example.player;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.player.Player;
import com.example.player.PlayerService;
import com.example.player.PlayerRepository;
import java.util.ArrayList;

@RestController
public class PlayerController {
    PlayerService PlayerService = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayer() {
        return PlayerService.getPlayers();
    }

    @GetMapping("/players/{playerId}")
    public ArrayList<Player> getPlayerById(@PathVariable("playerId") int playerId) {
        return PlayerService.getPlayerById(playerId);
    }
}