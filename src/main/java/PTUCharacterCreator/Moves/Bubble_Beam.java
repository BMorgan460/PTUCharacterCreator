package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bubble_Beam extends Move {
	{
		name = "Bubble Beam";
		effect = "Bubblebeam lowers the target's Speed by -1 CS on 18+.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 2;
		frequency = "At-Will";
		range = "4, 1 Target";
		type = "Water";
		category = "Special";
	}
	public Bubble_Beam(){}
}