package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Riposte extends Move {
	{
		name = "Riposte";
		effect = "Trigger: Your Target misses you with a melee Attack. Limitations: Melee or Short-Ranged Weapons Only";
		damageBase = 12;
		AC = 2;
		frequency = "Scene x2";
		range = "WR, 1 Target, Reaction, Trigger";
		type = "Weapon";
		category = "Physical";
	}
	public Riposte(){}
}