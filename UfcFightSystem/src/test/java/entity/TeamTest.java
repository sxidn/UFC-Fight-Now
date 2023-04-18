package entity;

import org.example.entity.Division;
import org.example.entity.Fighter;
import org.example.entity.Team;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeamTest {

    @Test
    void createTeam() {
        Fighter newFighter = new Fighter(32, Division.Heavyweight,"Jon Jones");
        Set fighters = new HashSet();
        fighters.add(newFighter);
        Team newTeam = new Team("Kings",fighters);
        assertEquals(newTeam.getName(),"Kings");

    }
}