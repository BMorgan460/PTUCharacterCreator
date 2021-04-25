package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Water_Sport extends Move {
	{
		name = "Water Sport";
		effect = "All targets in the burst, including the user, gain a Coat which grants them 1 Step of Resistance to Fire Type Moves. After a target has been hit by a damaging Fire Type Move, the coat is removed. *Grants Fountain";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "Burst 2, Coat";
		type = "Water";
		category = "Status";
	}
	public Water_Sport(){}
}