package fr.univavignon.pokedex.api;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;
import org.mockito.Mock;


public class IPokemonMetadataProviderTest {
	PokemonMetadataProvider PokMetPro;
	@Mock
	IPokemonMetadataProvider pokemonMetadataProvider;

	@BeforeEach
	void setup(){
		PokMetPro = new PokemonMetadataProvider(pokemonMetadataProvider);
	}
	@Test
	public void IPokemonMetadataProviderThrowsPokedexException() {

		try {
			doThrow(new PokedexException("")).when(pokemonMetadataProvider).getPokemonMetadata(-1);
			doThrow(new PokedexException("")).when(pokemonMetadataProvider).getPokemonMetadata(151);
			assertThrows(PokedexException.class,() -> {
				PokMetPro.getPokemonMetadata(-1);
		    });
			assertThrows(PokedexException.class,() -> {
				PokMetPro.getPokemonMetadata(151);
		    });
			
			
			
			
		} catch (PokedexException e) {

		}
		

	}
}
