package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Roost extends Move {
	{
		name = "Roost";
		effect = "The user regains HP equal to half of its full HP. If the user is a Flying Type, it loses the Flying Type until the start of their next turn.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Self";
		type = "Flying";
		category = "Status";
	}
	public Roost(){}
}