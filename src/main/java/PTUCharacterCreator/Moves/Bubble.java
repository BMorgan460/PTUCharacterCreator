package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bubble extends Move {
	{
		name = "Bubble";
		effect = "Bubble lowers the target's Speed by -1 CS on 16+..";
		damageBase = 4;
		AC = 2;
		frequency = "At-Will";
		range = "Burst 1";
		type = "Water";
		category = "Special";
	}
	public Bubble(){}
}