package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Round extends Move {
	{
		name = "Round";
		effect = "Round's Damage Base is equal to 6, plus +2 more for each use of Round by any Trainer or Pokemon this round, up to a maximum of DB 12 (3d12+10 / 30).";
		damageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "Burst 1, Sonic";
		type = "Normal";
		category = "Special";
	}
	public Round(){}
}