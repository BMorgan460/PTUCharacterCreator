package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mud_Shot extends Move {
	{
		name = "Mud Shot";
		effect = "The target's Speed is lowed by -1 Combat Stage.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 3;
		frequency = "At-Will";
		range = "3, 1 Target";
		type = "Ground";
		category = "Special";
	}
	public Mud_Shot(){}
}