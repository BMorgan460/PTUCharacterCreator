package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Focus_Energy extends Move {
	{
		name = "Focus Energy";
		effect = "The user becomes Pumped. While Pumped, the user's Critical Range is extended by 2, or 18+ if the Critical Range is not otherwise extended. Being switched will cause this effect to end.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "At-Will";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Focus_Energy(){}
}