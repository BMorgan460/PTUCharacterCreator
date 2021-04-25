package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class MudSlap extends Move {
	{
		name = "Mud-Slap";
		effect = "The target's Accuracy is lowered by -1.";
		damageBase = 2;
		mDamageBase = 2;
		AC = 2;
		frequency = "At-Will";
		range = "3, 1 Target";
		type = "Ground";
		category = "Special";
	}
	public MudSlap(){}
}