package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Heavy_Slam extends Move {
	{
		name = "Heavy Slam";
		effect = "For each weight class the user is above the target, increase Heavy Slam's Damage Base by +2.";
		damageBase = 4;
		mDamageBase = 4;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Steel";
		category = "Physical";
	}
	public Heavy_Slam(){}
}