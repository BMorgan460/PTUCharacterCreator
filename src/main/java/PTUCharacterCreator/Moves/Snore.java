package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Snore extends Move {
	{
		name = "Snore";
		effect = "Snore Flinches all legal targets on 15+. Snore may only be used by Sleeping users.";
		damageBase = 5;
		AC = 2;
		frequency = "EOT";
		range = "Burst 1, Sonic";
		type = "Normal";
		category = "Special";
	}
	public Snore(){}
}