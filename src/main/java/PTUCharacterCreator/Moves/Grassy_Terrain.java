package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Grassy_Terrain extends Move {
	{
		name = "Grassy Terrain";
		effect = "The area becomes Grassy for 5 rounds. While Grassy, all Pokemon and Trainers standing on the ground recover 1/10th of their maximum Hit Points at the start of every turn, and Grass-Type attacks performed by grounded Pokemon and Trainers gain a +10 bonus to Damage Rolls.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Field";
		type = "Grass";
		category = "Status";
	}
	public Grassy_Terrain(){}
}