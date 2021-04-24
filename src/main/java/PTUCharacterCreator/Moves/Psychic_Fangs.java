package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Psychic_Fangs extends Move {
	{
		name = "Psychic Fangs";
		effect = "Light Screen and Reflect may not be activated in response to Psychic Fangs.";
		damageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Psychic";
		category = "Physical";
	}
	public Psychic_Fangs(){}
}