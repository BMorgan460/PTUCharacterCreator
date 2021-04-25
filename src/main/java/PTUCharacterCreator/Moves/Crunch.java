package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Crunch extends Move {
	{
		name = "Crunch";
		effect = "Crunch lowers the target’s Defense by -1 CS on 17+.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Physical";
	}
	public Crunch(){}
}