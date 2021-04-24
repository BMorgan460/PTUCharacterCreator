package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Noble_Roar extends Move {
	{
		name = "Noble Roar";
		effect = "Noble Roar lowers all legal targets’ Attack and Special Attack by +1 CS.";
		damageBase = 0;
		AC = 2;
		frequency = "EOT";
		range = "Burst 1, Sonic, Friendly, Social";
		type = "Normal";
		category = "Status";
	}
	public Noble_Roar(){}
}