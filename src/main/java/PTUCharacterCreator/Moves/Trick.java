package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Trick extends Move {
	{
		name = "Trick";
		effect = "Both targets must be hit for Trick to succeed. The user may target itself or willing allies with Trick, you do not need to roll for Accuracy Check in these cases. Both targets lose their Held Item and gain the other target's Held Item. If a target has no Held Item, they still can gain the other target's Held Item.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene";
		range = "5, 2 Targets";
		type = "Psychic";
		category = "Status";
	}
	public Trick(){}
}