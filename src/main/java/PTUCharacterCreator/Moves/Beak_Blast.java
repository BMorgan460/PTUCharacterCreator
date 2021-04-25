package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Beak_Blast extends Move {
	{
		name = "Beak Blast";
		effect = "Use of Beak Blast must be declared as a Priority (Limited) action at the beginning of the round. Any Melee range attack that strikes the user during the round burns the moves user. At the end of the round, the user may shift and use Beak Blast.";
		damageBase = 10;
		mDamageBase = 10;
		AC = 4;
		frequency = "Scene x2";
		range = "Melee, Pass, Priority (Limited)";
		type = "Flying";
		category = "Physical";
	}
	public Beak_Blast(){}
}