package fr.univavignon.pokedex.api;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class IPokemonFactoryTest {


    @Test
    void ReturnValidPokemonWhenPokemonFactoryCreatePokemon(){
        PokemonFactory pf = new PokemonFactory();
        Pokemon p = pf.createPokemon(0,1,1,1,1);
        assertEquals(p.getName(),pf.createPokemon(0,1,1,1,1).getName());
        assertEquals(p.getAttack(),pf.createPokemon(0,1,1,1,1).getAttack());
        assertEquals(p.getCp(),pf.createPokemon(0,1,1,1,1).getCp());
        assertEquals(p.getCandy(),pf.createPokemon(0,1,1,1,1).getCandy());
        assertEquals(p.getDust(),pf.createPokemon(0,1,1,1,1).getDust());
        assertEquals(p.getHp(),pf.createPokemon(0,1,1,1,1).getHp());
        assertEquals(p.getIv(),pf.createPokemon(0,1,1,1,1).getIv());
        assertEquals(p.getIndex(),pf.createPokemon(0,1,1,1,1).getIndex());
        assertEquals(p.getDefense(),pf.createPokemon(0,1,1,1,1).getDefense());
        assertEquals(p.getStamina(),pf.createPokemon(0,1,1,1,1).getStamina());

    }
}
