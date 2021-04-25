package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Cross_Poison extends Move {
	{
		name = "Cross Poison";
		effect = "Cross Poison is a Critical Hit on 18+ and Poisons the target on 19+.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "Melee, Pass";
		type = "Poison";
		category = "Physical";
	}
	public Cross_Poison(){}
}