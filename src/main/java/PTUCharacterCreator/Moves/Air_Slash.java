package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Air_Slash extends Move {
	{
		name = "Air Slash";
		effect = "Air Slash Flinches the target on 15+.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 3;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Flying";
		category = "Special";
	}
	public Air_Slash(){}
}