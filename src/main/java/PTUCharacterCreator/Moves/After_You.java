package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class After_You extends Move {
	{
		name = "After You";
		effect = "After You is a Swift Action. The target takes their turn for the round immediately after the user finishes their turn, ignoring Initiative. After You may only affect a target that has not yet acted that round and can only affect willing targets.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "6, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public After_You(){}
}