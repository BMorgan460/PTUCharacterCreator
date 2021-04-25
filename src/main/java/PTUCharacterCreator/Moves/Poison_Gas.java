package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Poison_Gas extends Move {
	{
		name = "Poison Gas";
		effect = "Poison Gas Poisons all legal targets.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 6;
		frequency = "Scene";
		range = "Burst 1 or Cone 2";
		type = "Poison";
		category = "Status";
	}
	public Poison_Gas(){}
}