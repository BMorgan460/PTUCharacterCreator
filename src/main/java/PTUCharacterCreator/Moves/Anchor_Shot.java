package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Anchor_Shot extends Move {
	{
		name = "Anchor Shot";
		effect = "The target becomes Stuck and Trapped. If the target is freed of the Stuck condition, they are freed of Trapped as well.";
		damageBase = 8;
		AC = 2;
		frequency = "Scene x2";
		range = "8, 1 Target";
		type = "Steel";
		category = "Physical";
	}
	public Anchor_Shot(){}
}