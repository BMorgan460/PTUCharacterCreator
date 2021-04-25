package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Clear_Smog extends Move {
	{
		name = "Clear Smog";
		effect = "The target's Combat Stages are reset to their defaults, and all Coats on the target are destroyed. Clear Smog cannot miss.";
		damageBase = 5;
		mDamageBase = 5;
		AC = 0;
		frequency = "Scene x2";
		range = "6, 1 Target";
		type = "Poison";
		category = "Special";
	}
	public Clear_Smog(){}
}