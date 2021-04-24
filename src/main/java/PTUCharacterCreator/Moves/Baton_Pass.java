package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Baton_Pass extends Move {
	{
		name = "Baton Pass";
		effect = "The user is replaced with another Pokemon from their trainer’s roster. All Combat Stage, Coats, and [Stratagems] on Baton Pass’ user are transferred to the replacement. Baton Pass may be used to switch even if the user is Trapped.";
		damageBase = 0;
		AC = 0;
		frequency = "At-Will";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Baton_Pass(){}
}