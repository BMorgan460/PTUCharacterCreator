package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Feather_Dance extends Move {
	{
		name = "Feather Dance";
		effect = "All legal targets have their Attack lowered 2 Combat Stages.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "EOT";
		range = "Burst 1, Friendly";
		type = "Flying";
		category = "Status";
	}
	public Feather_Dance(){}
}