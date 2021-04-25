package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Nightmare extends Move {
	{
		name = "Nightmare";
		effect = "Nightmare can only hit Legal Targets that are Asleep. The target gains Bad Sleep.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target";
		type = "Ghost";
		category = "Status";
	}
	public Nightmare(){}
}