package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mud_Bomb extends Move {
	{
		name = "Mud Bomb";
		effect = "The target's Accuracy is lowered by -1 on 16+.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 4;
		frequency = "At-Will";
		range = "6, 1 Target";
		type = "Ground";
		category = "Special";
	}
	public Mud_Bomb(){}
}