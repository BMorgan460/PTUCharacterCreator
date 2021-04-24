package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Magic_Burst extends Move {
	{
		name = "Magic Burst";
		effect = "Foes hit by Magic Burst can’t make Attacks of Opportunity for 1 full round. Limitation: Melee Weapons Only";
		damageBase = 6;
		AC = 2;
		frequency = "Scene x2";
		range = "Burst 1, Friendly";
		type = "Weapon";
		category = "Special";
	}
	public Magic_Burst(){}
}