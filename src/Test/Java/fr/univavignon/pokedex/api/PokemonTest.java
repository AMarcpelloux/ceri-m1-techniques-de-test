package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
public class PokemonTest {
    Pokemon pk = new Pokemon(0,"bob",1,1,1,1,1,1,1,1);
    @Test
    void ReturnPokemoncp(){
        assertEquals(1,pk.getCp());
    }    @Test
    void ReturnPokemonhp(){
        assertEquals(1,pk.getHp());
    }
    @Test
    void ReturnPokemondust(){
        assertEquals(1,pk.getDust());
    }
    @Test
    void ReturnPokemoncandy(){
        assertEquals(1,pk.getCandy());
    }
    @Test
    void ReturnPokemoniv(){
        assertEquals(1,pk.getIv());
    }

}
