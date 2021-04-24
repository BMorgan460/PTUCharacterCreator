package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Psionic_Sponge extends Feature {
	{
		name = "Psionic Sponge";
		tags = "";
		frequency = "At-Will - Special";
		effect = "Your Psychic-Type Pokemon may activate Psychic Sponge as a Shift Action to add a Psychic Type Move known by an ally within X meters to their Move List until the end of their turn. This does not allow them to have duplicate Moves in their Move List. This Feature may only be used once per Pokemon per Scene, and X is equal to your Type-Linked Skill Rank.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Psychic as Chosen Type", 0);
	}
	public Psionic_Sponge(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}