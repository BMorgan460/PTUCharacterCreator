package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Uproar extends Move {
	{
		name = "Uproar";
		effect = "All Pokemon and Trainers within 5 meters of the user are cured of Sleep.";
		damageBase = 5;
		AC = 2;
		frequency = "EOT";
		range = "Burst 1, Spirit Surge, Sonic";
		type = "Normal";
		category = "Special";
	}
	public Uproar(){}
}