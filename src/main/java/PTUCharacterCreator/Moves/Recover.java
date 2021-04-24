package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Recover extends Move {
	{
		name = "Recover";
		effect = "The user regains HP equal to half of its full HP.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Recover(){}
}