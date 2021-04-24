package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Shadow_Ball extends Move {
	{
		name = "Shadow Ball";
		effect = "Shadow Ball lowers the foe's Special Defense 1 Combat Stage on 17+.";
		damageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "8, 1 Target";
		type = "Ghost";
		category = "Special";
	}
	public Shadow_Ball(){}
}