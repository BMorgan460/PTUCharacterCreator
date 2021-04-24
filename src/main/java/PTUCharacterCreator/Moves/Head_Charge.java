package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Head_Charge extends Move {
	{
		name = "Head Charge";
		effect = "The target is Pushed back 2 meters.";
		damageBase = 12;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target, Push, Recoil 1/3";
		type = "Normal";
		category = "Physical";
	}
	public Head_Charge(){}
}