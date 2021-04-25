package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Quash extends Move {
	{
		name = "Quash";
		effect = "Change the target's Initiative to 0 for the remainder of the round.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "At-Will";
		range = "10, 1 Target, Social";
		type = "Dark";
		category = "Status";
	}
	public Quash(){}
}