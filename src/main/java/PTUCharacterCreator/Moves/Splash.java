package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Splash extends Move {
	{
		name = "Splash";
		effect = "Shift Action - The user may make a single Jump, adding +1 to their Long Jump and High Jump values, and gains +2 Evasion until the end of their next turn. *Grants +1 Long Jump";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "At-Will";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Splash(){}
}