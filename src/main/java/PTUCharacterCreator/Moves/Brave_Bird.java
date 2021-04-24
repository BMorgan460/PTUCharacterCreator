package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Brave_Bird extends Move {
	{
		name = "Brave Bird";
		effect = "The target is pushed back 2 meters.";
		damageBase = 12;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target, Dash, Push, Recoil 1/3";
		type = "Flying";
		category = "Physical";
	}
	public Brave_Bird(){}
}