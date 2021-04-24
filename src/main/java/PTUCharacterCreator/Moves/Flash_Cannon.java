package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Flash_Cannon extends Move {
	{
		name = "Flash Cannon";
		effect = "Flash Cannon lowers the target's Special Defense by -1 CS on 17+.";
		damageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Steel";
		category = "Special";
	}
	public Flash_Cannon(){}
}