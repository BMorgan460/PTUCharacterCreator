package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Jump_Kick extends Move {
	{
		name = "Jump Kick";
		effect = "If Jump Kick misses, the user loses Hit Points equal to 1/4th of their Max Hit Points. A failure to hit due to a Move with the Shield keyword does not count as a miss. This cannot be used if Gravity is in effect.";
		damageBase = 10;
		mDamageBase = 10;
		AC = 3;
		frequency = "At-Will";
		range = "Melee, Dash, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public Jump_Kick(){}
}