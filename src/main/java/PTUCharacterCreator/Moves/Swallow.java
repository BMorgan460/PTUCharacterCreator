package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Swallow extends Move {
	{
		name = "Swallow";
		effect = "If the user’s Stockpiled count is 1, they are healed 25% of their full Hit Point value, if their Stockpiled count is 2, they are healed half of their full Hit Point value, if their Stockpiled count is 3, they are healed back to full Hit Points. After using Swallow, the user’s Stockpiled count is set to 0. If the user has no Stockpiled count, Swallow does nothing.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Swallow(){}
}