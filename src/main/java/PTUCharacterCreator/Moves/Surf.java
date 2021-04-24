package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Surf extends Move {
	{
		name = "Surf";
		effect = "As a Shift Action, the user may Move to any open square in Surf ’s area of effect without provoking any Attacks of Opportunity.";
		damageBase = 9;
		AC = 2;
		frequency = "EOT";
		range = "Line 6";
		type = "Water";
		category = "Special";
	}
	public Surf(){}
}