package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Geomancy extends Move {
	{
		name = "Geomancy";
		effect = "Set-Up Effect: The user may not shift this round. The user may create as many squares of Rough Terrain as it wants within a Burst 3 as plants burst through the ground, regardless of the surface material. Resolution Effect: Geomancy raises the user's Special Attack, Special Defense, and Speed by +2 CS.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self, Set Up";
		type = "Fairy";
		category = "Status";
	}
	public Geomancy(){}
}