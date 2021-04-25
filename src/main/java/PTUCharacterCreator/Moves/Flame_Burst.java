package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Flame_Burst extends Move {
	{
		name = "Flame Burst";
		effect = "Any Trainers or Pokemon cardinally adjacent to the target lose 5 Hit Points";
		damageBase = 7;
		mDamageBase = 7;
		AC = 2;
		frequency = "At-Will";
		range = "6, 1 Target";
		type = "Fire";
		category = "Special";
	}
	public Flame_Burst(){}
}