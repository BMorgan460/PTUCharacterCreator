package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fissure extends Move {
	{
		name = "Fissure";
		effect = "Roll 1d100. This roll may not be modified in any way. If you roll X or lower, the target Faints. X is equal to 30 + The User's Level - The Target's Level. *Grants: Groundshaper";
		damageBase = 0;
		AC = 0;
		frequency = "Daily";
		range = "5, 1 Target, Execute, Groundsource";
		type = "Ground";
		category = "Status";
	}
	public Fissure(){}
}