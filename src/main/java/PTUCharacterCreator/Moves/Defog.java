package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Defog extends Move {
	{
		name = "Defog";
		effect = "The Weather becomes Clear, and all Blessings, Coats, and Hazards are destroyed. Clear Weather is the default weather, conferring no bonuses or penalties of any sort.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Field, Weather";
		type = "Flying";
		category = "Status";
	}
	public Defog(){}
}