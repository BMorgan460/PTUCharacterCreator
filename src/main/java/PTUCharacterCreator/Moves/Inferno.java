package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Inferno extends Move {
	{
		name = "Inferno";
		effect = "Inferno Burns the target. Inferno ignores the target's Evasion if there are no other combatants or Rough or Blocking Terrain within 2 meters of the target.";
		damageBase = 10;
		mDamageBase = 10;
		AC = 9;
		frequency = "At-Will";
		range = "6, 1 Target";
		type = "Fire";
		category = "Special";
	}
	public Inferno(){}
}