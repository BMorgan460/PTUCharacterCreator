package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Magma_Storm extends Move {
	{
		name = "Magma Storm";
		effect = "The target is put in a Vortex, this effect occurs even if Magma Storm misses its target.";
		damageBase = 10;
		AC = 6;
		frequency = "Scene";
		range = "6, 1 Target";
		type = "Fire";
		category = "Special";
	}
	public Magma_Storm(){}
}