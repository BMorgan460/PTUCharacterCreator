package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Infestation extends Move {
	{
		name = "Infestation";
		effect = "The target is put in a Vortex.";
		damageBase = 4;
		mDamageBase = 4;
		AC = 4;
		frequency = "Scene x2";
		range = "3, 1 Target";
		type = "Bug";
		category = "Special";
	}
	public Infestation(){}
}