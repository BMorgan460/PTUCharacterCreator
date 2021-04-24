package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Focus_Blast extends Move {
	{
		name = "Focus Blast";
		effect = "Focus Blast lowers the target's Special Defense by -1 CS on 18+.";
		damageBase = 12;
		AC = 7;
		frequency = "Scene x2";
		range = "6, 1 Target, Smite, Aura";
		type = "Fighting";
		category = "Special";
	}
	public Focus_Blast(){}
}