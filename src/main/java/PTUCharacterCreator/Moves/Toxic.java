package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Toxic extends Move {
	{
		name = "Toxic";
		effect = "The target is Badly Poisoned. If the user is Poison Type, Toxic cannot miss.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 4;
		frequency = "Scene x2";
		range = "4, 1 Target";
		type = "Poison";
		category = "Status";
	}
	public Toxic(){}
}