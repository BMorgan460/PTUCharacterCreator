package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Muddy_Water extends Move {
	{
		name = "Muddy Water";
		effect = "As a Shift Action, the user may Move to any open square in Muddy Water’s area of effect without provoking any Attacks of Opportunity. On 16+, the Accuracy of all targets is lowered by 1.";
		damageBase = 9;
		AC = 5;
		frequency = "EOT";
		range = "Close Blast 2";
		type = "Water";
		category = "Special";
	}
	public Muddy_Water(){}
}