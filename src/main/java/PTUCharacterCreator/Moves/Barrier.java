package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Barrier extends Move {
	{
		name = "Barrier";
		effect = "The user creates a Barrier of psychic energy. The user places up to 4 segments of Barrier, each segment must be continuous with another segment, and at least one must be adjacent to the user. These barriers count as blocking terrain and last until the end of the encounter or until they are destroyed. Each Barrier segment is 2 meters tall, 1 meter wide, and 2 centimeters thick. Each segment has 20 Hit Points, 15 Damage Reduction, and takes damage as if it was Psychic Typed.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "Hazard";
		type = "Psychic";
		category = "Status";
	}
	public Barrier(){}
}