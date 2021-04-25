package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Slam extends Move {
	{
		name = "Slam";
		effect = "Slam may be used as a Free Action at the end of a Sprint Maneuver taken as a Standard Action, as long as the user Shifted at least 3 meters in a straight line towards the target. When used this way, Slam gains the Smite keyword.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 6;
		frequency = "At-Will";
		range = "Melee, 1 Target, Dash";
		type = "Normal";
		category = "Physical";
	}
	public Slam(){}
}