package fr.univavignon.pokedex.api;

public class PokemonMetadataProvider implements IPokemonMetadataProvider{
    IPokemonMetadataProvider pokemonMetadataProvider;
    public PokemonMetadataProvider(IPokemonMetadataProvider pokemonMetadataProvider) {
        this.pokemonMetadataProvider=pokemonMetadataProvider;
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return pokemonMetadataProvider.getPokemonMetadata(index);
    }
}
