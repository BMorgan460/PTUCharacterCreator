package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class First_Blood extends Feature {
	{
		name = "First Blood";
		tags = "[+Speed]";
		frequency = "Scene - Free Action";
		effect = "Trigger: You release a Pokemon from its Poke Ball Effect: If you have a Pokemon turn available this round or next, your Pokemon may use a Move as an Interrupt as soon as it is sent out. This consumes your Pokemon turn for the round (or the following round) as normal.";
		prereqs.put("Tag In", -1);
		prereqs.put("Acrobatics", 6);
		prereqs.put("Guile", 6);
	}
	public First_Blood(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Tag In") && t.checkSkillRank("Acrobatics",6) && t.checkSkillRank("Guile",6);
	}
}