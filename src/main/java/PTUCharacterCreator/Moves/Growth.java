package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Growth extends Move {
	{
		name = "Growth";
		effect = "Raise the user's Attack and Special Attack by +1 CS each. If it is Sunny, double the amount of Combat Stages gained. *Grants Inflatable";
		damageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Growth(){}
}