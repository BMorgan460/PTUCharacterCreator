package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class LockOn extends Move {
	{
		name = "Lock-On";
		effect = "The target is Locked-On. The next Move that the user uses against the Target that requires an Accuracy Check cannot miss. Lock-On's effect, on both the User and Target, can be passed by Baton Pass.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "At-Will";
		range = "10, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public LockOn(){}
}