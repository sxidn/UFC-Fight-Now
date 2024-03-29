package org.example.entity;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MatchTest {
    @Test
    void createMatch() {
        Set<Fighter> fighters = new HashSet<>();
        Set<Fighter> fighters2 = new HashSet<>();
        fighters.add(new Fighter(30,Division.LightHeavyweight,"Islam Makachev"));
        fighters2.add(new Fighter(30,Division.Heavyweight,"Jon Jones"));

        Match ufc285 = new Match("Champions Fight",new Team("Kings",fighters),new Team("Wolfes",fighters2));
        assertEquals(ufc285.getName(),"Champions Fight");
    }
}