package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class High_Horsepower extends Move {
	{
		name = "High Horsepower";
		effect = "The target is Pushed 2 meters.";
		damageBase = 10;
		mDamageBase = 10;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target, Dash, Push";
		type = "Ground";
		category = "Physical";
	}
	public High_Horsepower(){}
}