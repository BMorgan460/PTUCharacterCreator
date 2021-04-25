package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Spider_Web extends Move {
	{
		name = "Spider Web";
		effect = "Spider Web cannot miss. The target is Stuck and Trapped. If the target is freed of the Stuck condition, it is freed of Trapped as well. *Grants Threaded";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "5, 1 Target";
		type = "Bug";
		category = "Status";
	}
	public Spider_Web(){}
}