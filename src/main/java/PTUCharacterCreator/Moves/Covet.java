package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Covet extends Move {
	{
		name = "Covet";
		effect = "Covet takes the target’s Held Item or Accessory Slot Item and attaches it to Covet’s user, if the user is not holding anything.";
		damageBase = 6;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Covet(){}
}