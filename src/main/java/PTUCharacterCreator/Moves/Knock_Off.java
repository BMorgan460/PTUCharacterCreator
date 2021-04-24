package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Knock_Off extends Move {
	{
		name = "Knock Off";
		effect = "Choose one of the target's Held Items or Accessory Slot Items. It is knocked to the ground.";
		damageBase = 7;
		AC = 2;
		frequency = "Scene";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Physical";
	}
	public Knock_Off(){}
}