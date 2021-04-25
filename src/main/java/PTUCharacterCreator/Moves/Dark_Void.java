package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Dark_Void extends Move {
	{
		name = "Dark Void";
		effect = "The target falls Asleep. Once per Scene, Dark Void may be used as if its range were “Burst 5, Friendly” instead.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 4;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Status";
	}
	public Dark_Void(){}
}