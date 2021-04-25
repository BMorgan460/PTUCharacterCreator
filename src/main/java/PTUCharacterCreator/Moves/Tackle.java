package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Tackle extends Move {
	{
		name = "Tackle";
		effect = "The target is Pushed 2 Meters.";
		damageBase = 5;
		mDamageBase = 5;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target, Dash, Push";
		type = "Normal";
		category = "Physical";
	}
	public Tackle(){}
}