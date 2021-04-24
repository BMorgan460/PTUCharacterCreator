package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Endeavor extends Move {
	{
		name = "Endeavor";
		effect = "The target loses a Tick of Hit Points for each Injury the user has.";
		damageBase = 0;
		AC = 2;
		frequency = "Scene";
		range = "Melee, 1 Target, Dash";
		type = "Normal";
		category = "Physical";
	}
	public Endeavor(){}
}