package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Wish extends Move {
	{
		name = "Wish";
		effect = "At the end of the user's next turn, the target regains HP equal to half of its full HP. If the user targets itself and is replaced in battle, the replacement is healed by half of its own HP.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "15, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Wish(){}
}