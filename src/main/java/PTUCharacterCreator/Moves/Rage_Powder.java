package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Rage_Powder extends Move {
	{
		name = "Rage Powder";
		effect = "All legal targets hit by Rage Powder are Enraged. While enraged, they must shift to target the user when using a Move or Attack if the user is within reach. If the user is Fainted or Switched out, all legal targets hit by Rage Powder are no longer Enraged.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "Burst 1 or Line 6, Powder";
		type = "Bug";
		category = "Status";
	}
	public Rage_Powder(){}
}