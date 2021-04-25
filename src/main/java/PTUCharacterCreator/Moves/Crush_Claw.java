package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Crush_Claw extends Move {
	{
		name = "Crush Claw";
		effect = "Crush Claw lowers the target’s Defense by -1 CS on Even-Numbered Rolls.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 3;
		frequency = "EOT";
		range = "Melee, 1 Target, Dash";
		type = "Normal";
		category = "Physical";
	}
	public Crush_Claw(){}
}