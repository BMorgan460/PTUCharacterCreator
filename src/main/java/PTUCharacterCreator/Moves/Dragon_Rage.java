package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Dragon_Rage extends Move {
	{
		name = "Dragon Rage";
		effect = "Dragon Rage causes the target to lose 15 HP. Dragon Rage is Special and interacts with other moves and effects as such (Special Evasion may be applied to avoid it, Mirror Coat can reflect it, etc.).";
		damageBase = 0;
		AC = 2;
		frequency = "At-Will";
		range = "4, 1 Target";
		type = "Dragon";
		category = "Special";
	}
	public Dragon_Rage(){}
}