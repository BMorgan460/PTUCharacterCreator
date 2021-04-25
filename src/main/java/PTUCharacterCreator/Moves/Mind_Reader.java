package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mind_Reader extends Move {
	{
		name = "Mind Reader";
		effect = "The target becomes Read to the user until the end of the user’s next turn. The user may end this effect when making an Attack on the user, causing that attack to automatically hit, OR when the Read target uses an Attack against the user, causing that attack to automatically miss. If the user has the Telepathy Capability, the user automatically succeeds on a mindreading attempt against the target, and may listen to the target’s surface thoughts as long as they remain Read. Mind Reader automatically misses against targets with the Mindlock Capability.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "6, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Mind_Reader(){}
}