package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Taunt extends Move {
	{
		name = "Taunt";
		effect = "The target becomes Enraged.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 3;
		frequency = "EOT";
		range = "6, 1 Target, Social";
		type = "Dark";
		category = "Status";
	}
	public Taunt(){}
}