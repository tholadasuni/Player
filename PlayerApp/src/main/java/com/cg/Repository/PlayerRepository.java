
package com.cg.Repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.Model.Player;

@Repository
public interface PlayerRepository extends MongoRepository<Player, Integer> {

}
