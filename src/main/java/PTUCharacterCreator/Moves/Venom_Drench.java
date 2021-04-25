package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Venom_Drench extends Move {
	{
		name = "Venom Drench";
		effect = "All Poisoned targets have their Attack, Special Attack, and Speed lowered by -1 CS. Venom Drench cannot miss.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "Cone 2";
		type = "Poison";
		category = "Status";
	}
	public Venom_Drench(){}
}