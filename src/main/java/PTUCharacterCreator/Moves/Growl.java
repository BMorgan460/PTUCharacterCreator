package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Growl extends Move {
	{
		name = "Growl";
		effect = "Lower the Attack of all legal targets by -1 CS.";
		damageBase = 0;
		AC = 2;
		frequency = "At-Will";
		range = "Burst 1, Friendly, Sonic, Social";
		type = "Normal";
		category = "Status";
	}
	public Growl(){}
}