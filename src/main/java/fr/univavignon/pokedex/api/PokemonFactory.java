package fr.univavignon.pokedex.api;

public class PokemonFactory implements IPokemonFactory{
    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        PokemonMetadataProvider pmp = PokemonMetadataProvider.getProvider();
        try {
            PokemonMetadata pm = pmp.getPokemonMetadata(index);
            return new Pokemon(index,pm.getName(),pm.getAttack(),pm.getDefense(),pm.getStamina(),cp,hp,dust,candy,((double) (pm.getStamina() + pm.getAttack() + pm.getDefense()) /45)*100);
        } catch (PokedexException e) {
            return null;
        }

    }
}
