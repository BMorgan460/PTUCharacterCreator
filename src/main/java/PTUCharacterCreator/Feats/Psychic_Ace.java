package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Psychic_Ace extends Feature {
	{
		name = "Psychic Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Mind Moldor Type Strategist Ability for Psychic. You may target a Pokemon only once with PsychicAce.";
		prereqs.put("2 Different Pokemon of Psychic Type", 0);
		prereqs.put("Focus OR Ocu Edu at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Focus OR Ocu Edu at Novice.", 0);
	}
	public Psychic_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Focus", 3) || t.checkSkillRank("Ocu Edu", 3);
	}
}