package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Zap_Cannon extends Move {
	{
		name = "Zap Cannon";
		effect = "Zap Cannon Paralyzes the target. Zap Cannon ignores the target's Evasion if their are no other combatants or Rough or Blocking Terrain within 2 meters of the target.";
		damageBase = 12;
		mDamageBase = 12;
		AC = 9;
		frequency = "At-Will";
		range = "12, 1 Target";
		type = "Electric";
		category = "Special";
	}
	public Zap_Cannon(){}
}