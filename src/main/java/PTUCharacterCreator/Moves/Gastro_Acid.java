package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Gastro_Acid extends Move {
	{
		name = "Gastro Acid";
		effect = "The target's Ability is disabled until the end of the encounter. If the target has more than one ability, you choose one of them to disable.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene";
		range = "4. 1 Target";
		type = "Poison";
		category = "Status";
	}
	public Gastro_Acid(){}
}