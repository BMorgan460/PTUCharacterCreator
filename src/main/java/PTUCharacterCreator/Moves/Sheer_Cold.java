package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sheer_Cold extends Move {
	{
		name = "Sheer Cold";
		effect = "Roll 1d100. This roll may not be modified in any way. If you roll X or lower, the target Faints. X is equal to 30 + The User's Level - The Target's Level. *Grants: Freezer";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily";
		range = "4, 1 Target, Execute";
		type = "Ice";
		category = "Status";
	}
	public Sheer_Cold(){}
}