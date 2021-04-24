package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Snatch extends Move {
	{
		name = "Snatch";
		effect = "If the target uses a Self-Targeting Move, you may use Snatch as an Interrupt. You gain the benefits of the Self-Targeting Move instead of the target.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "6, 1 Target, Trigger, Interrupt";
		type = "Dark";
		category = "Status";
	}
	public Snatch(){}
}