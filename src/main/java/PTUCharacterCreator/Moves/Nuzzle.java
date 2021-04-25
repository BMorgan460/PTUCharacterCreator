package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Nuzzle extends Move {
	{
		name = "Nuzzle";
		effect = "Nuzzle Paralyzes the target.";
		damageBase = 2;
		mDamageBase = 2;
		AC = 2;
		frequency = "Scene";
		range = "Melee, 1 Target";
		type = "Electric";
		category = "Physical";
	}
	public Nuzzle(){}
}