package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Psychic_Terrain extends Move {
	{
		name = "Psychic Terrain";
		effect = "The area becomes Weird for 5 rounds. While Weird, all Pokemon and Trainers standing on the ground are unable to use moves with the Priority keyword and Psychic-type attacks used by Pokemon and Trainers touching the ground gain a +10 bonus to Damage Rolls.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "Field";
		type = "Psychic";
		category = "Status";
	}
	public Psychic_Terrain(){}
}