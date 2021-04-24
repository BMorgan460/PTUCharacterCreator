package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Blaze_Kick extends Move {
	{
		name = "Blaze Kick";
		effect = "Blaze Kick Burns the target on 19+ and is a Critical Hit on 18+.";
		damageBase = 9;
		AC = 4;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Fire";
		category = "Physical";
	}
	public Blaze_Kick(){}
}