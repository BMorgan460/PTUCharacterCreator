package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Guillotine extends Move {
	{
		name = "Guillotine";
		effect = "Roll 1d100. This roll may not be modified in any way. If you roll X or lower, the target Faints. X is equal to 30 + The User's Level - The Target's Level.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily";
		range = "Melee, 1 Target, Execute";
		type = "Normal";
		category = "Status";
	}
	public Guillotine(){}
}