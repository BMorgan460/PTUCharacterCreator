package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Astonish extends Move {
	{
		name = "Astonish";
		effect = "Astonish Flinches the target on 15+. Once per Scene, if the target is unaware of the user's presence, Astonish automatically Flinches.";
		damageBase = 3;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Ghost";
		category = "Physical";
	}
	public Astonish(){}
}