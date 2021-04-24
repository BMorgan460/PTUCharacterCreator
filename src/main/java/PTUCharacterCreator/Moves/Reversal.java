package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Reversal extends Move {
	{
		name = "Reversal";
		effect = "For each Injury the user has, Reversal's Damage Base is increased by +1.";
		damageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public Reversal(){}
}