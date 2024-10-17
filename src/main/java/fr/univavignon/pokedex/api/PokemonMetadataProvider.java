package fr.univavignon.pokedex.api;

public class PokemonMetadataProvider implements IPokemonMetadataProvider{
    private PokemonMetadata[] pokemonMetadata;
    private int id;
    public PokemonMetadataProvider() {
        this.id = 0;
        this.pokemonMetadata =  new PokemonMetadata[151];
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if((this.id>0&&this.id<=150) && pokemonMetadata[index] != null)
            return pokemonMetadata[index];
        else throw new PokedexException("Pokemon dont exist");
    }
    public void addPokemonMetadata(PokemonMetadata PM){
        if(id<=150){
            this.pokemonMetadata[id]=PM;
            this.id++;
        }
    }
}
