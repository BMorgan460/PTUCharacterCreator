package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Spit_Up extends Move {
	{
		name = "Spit Up";
		effect = "For each Stockpiled Count the user has, Spit Up’s Damage Base is increased by +8. If the user has no Stockpiled count, Spit Up cannot be used.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene";
		range = "4, 1 Target";
		type = "Normal";
		category = "Special";
	}
	public Spit_Up(){}
}