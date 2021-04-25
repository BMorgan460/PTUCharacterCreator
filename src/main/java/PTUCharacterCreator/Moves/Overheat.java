package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Overheat extends Move {
	{
		name = "Overheat";
		effect = "Lower the user's Special Attack 2 Combat Stages after damage.";
		damageBase = 13;
		mDamageBase = 13;
		AC = 4;
		frequency = "Scene";
		range = "8, Ranged Blast 3, Smite";
		type = "Fire";
		category = "Special";
	}
	public Overheat(){}
}