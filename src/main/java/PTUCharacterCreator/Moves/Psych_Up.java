package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Psych_Up extends Move {
	{
		name = "Psych Up";
		effect = "The user's Combat Stages are changed to match the target's Combat Stages. Psych Up cannot miss.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "6, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Psych_Up(){}
}