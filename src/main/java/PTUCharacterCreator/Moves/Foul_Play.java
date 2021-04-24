package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Foul_Play extends Move {
	{
		name = "Foul Play";
		effect = "The target reveals its Attack stat. When calculating damage, add the target's Attack stat instead of the user's Attack stat.";
		damageBase = 10;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Physical";
	}
	public Foul_Play(){}
}