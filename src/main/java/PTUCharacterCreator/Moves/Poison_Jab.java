package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Poison_Jab extends Move {
	{
		name = "Poison Jab";
		effect = "Poison Jab Poisons the target on 15+.";
		damageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Poison";
		category = "Physical";
	}
	public Poison_Jab(){}
}