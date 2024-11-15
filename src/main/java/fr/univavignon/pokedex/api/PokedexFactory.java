package fr.univavignon.pokedex.api;

public class PokedexFactory implements IPokedexFactory{
    @Override
    public IPokedex createPokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory) {
        Pokedex pkdFromFactory = new Pokedex();
        pkdFromFactory.pokemonMetadataProvider = (PokemonMetadataProvider) metadataProvider;
        pkdFromFactory.pokemonFactory = (PokemonFactory) pokemonFactory;
        return pkdFromFactory;
    }
}
