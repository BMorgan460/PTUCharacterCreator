package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mud_Sport extends Move {
	{
		name = "Mud Sport";
		effect = "All targets in the burst, including the user, gain a Coat which grants them 1 Step of Resistance to Electric Type Moves. After a target has been hit by a damaging Electric Type Move, the coat is removed.";
		damageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "Burst 2";
		type = "Ground";
		category = "Status";
	}
	public Mud_Sport(){}
}