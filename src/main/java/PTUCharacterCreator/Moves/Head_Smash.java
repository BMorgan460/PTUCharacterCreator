package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Head_Smash extends Move {
	{
		name = "Head Smash";
		effect = "The target is pushed 2 meters.";
		damageBase = 15;
		AC = 5;
		frequency = "Scene";
		range = "Melee, 1 Target, Dash, Push, Recoil 1/3";
		type = "Rock";
		category = "Physical";
	}
	public Head_Smash(){}
}