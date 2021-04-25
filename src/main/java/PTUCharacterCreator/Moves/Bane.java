package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bane extends Move {
	{
		name = "Bane";
		effect = "The target loses a Tick of Hit Points at the start of their next three turns and suffers a -2 penalty to all Save Checks on those turns.";
		damageBase = 4;
		mDamageBase = 4;
		AC = 2;
		frequency = "Scene x2";
		range = "WR, 1 Target";
		type = "Weapon";
		category = "Special";
	}
	public Bane(){}
}