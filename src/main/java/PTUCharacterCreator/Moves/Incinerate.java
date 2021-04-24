package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Incinerate extends Move {
	{
		name = "Incinerate";
		effect = "If a target is holding a Held Item or Main or Off-Hand item, they must either drop it immediately or lose a Tick of Hit Points. This may only cause a target to lose at most one Tick of Hit Points, no matter how many items they were holding";
		damageBase = 6;
		AC = 2;
		frequency = "At-Will";
		range = "Line 3";
		type = "Fire";
		category = "Special";
	}
	public Incinerate(){}
}