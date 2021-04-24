package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Furious_Strikes extends Move {
	{
		name = "Furious Strikes";
		effect = "For each hit rolled on your Five Strike roll, the target of the attack has their Evasion reduced by 1 for one full round. Limitation: Melee or Short Ranged Weapons Only";
		damageBase = 3;
		AC = 2;
		frequency = "Scene x2";
		range = "WR, 1 Target, Five Strike";
		type = "Weapon";
		category = "Physical";
	}
	public Furious_Strikes(){}
}