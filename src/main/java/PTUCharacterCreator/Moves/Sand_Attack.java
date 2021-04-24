package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sand_Attack extends Move {
	{
		name = "Sand Attack";
		effect = "The target is Blinded until the end of their next turn.";
		damageBase = 0;
		AC = 2;
		frequency = "EOT";
		range = "2, 1 Target";
		type = "Ground";
		category = "Status";
	}
	public Sand_Attack(){}
}