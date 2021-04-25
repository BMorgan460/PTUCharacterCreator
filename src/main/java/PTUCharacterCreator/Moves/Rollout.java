package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Rollout extends Move {
	{
		name = "Rollout";
		effect = "The user continues to use Rollout on each of its turns until they miss any target with Rollout, or are not able to hit any target with Rollout during their turn. Each successive use of Rollout increases Rollout’s Damage Base by +4 to a maximum of DB 15.";
		damageBase = 3;
		mDamageBase = 3;
		AC = 4;
		frequency = "At-Will";
		range = "Melee, Pass";
		type = "Rock";
		category = "Physical";
	}
	public Rollout(){}
}