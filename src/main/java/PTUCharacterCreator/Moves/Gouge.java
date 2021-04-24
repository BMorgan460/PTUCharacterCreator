package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Gouge extends Move {
	{
		name = "Gouge";
		effect = "If both hits of Gouge successfully hit the target, the target gains an Injury. Limitation: Small Melee and Short Ranged Weapons Only";
		damageBase = 5;
		AC = 2;
		frequency = "Scene x2";
		range = "WR, 1 Target, Double Strike";
		type = "Weapon";
		category = "Physical";
	}
	public Gouge(){}
}