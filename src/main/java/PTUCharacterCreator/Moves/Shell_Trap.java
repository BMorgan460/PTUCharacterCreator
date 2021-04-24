package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Shell_Trap extends Move {
	{
		name = "Shell Trap";
		effect = "The user must declare Shell Trap as a Priority (Limited) action. At the end of the round, the user may shift and use Shell Type if they were hit by a Physical attack that round.";
		damageBase = 15;
		AC = 4;
		frequency = "Daily x2";
		range = "Burst 2, Smite, Priority (Limited)";
		type = "Fire";
		category = "Special";
	}
	public Shell_Trap(){}
}