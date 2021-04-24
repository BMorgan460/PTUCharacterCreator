package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dabbler extends Feature {
	{
		name = "Dabbler";
		tags = "";
		frequency = "Static";
		effect = "At the Level 5, 10, 20, 30, and 40 Character Advancement Level Milestones, if you choose to gain Bonus Stats, you also gain an Edge for which you qualify. If you choose Bonus Edges or Features, you also gain +2 to your choice of Attack or Special Attack. This applies retroactively.";
		prereqs.put("Hobbyist", -1);
		prereqs.put("Gen Edu", 5);
		prereqs.put("Perception", 5);
	}
	public Dabbler(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hobbyist") && t.checkSkillRank("Gen Edu",5) && t.checkSkillRank("Perception",5);
	}
}