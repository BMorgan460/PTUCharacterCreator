package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Hobbyist extends Feature {
	{
		name = "Hobbyist";
		tags = "[Class]";
		frequency = "Static";
		effect = "Effect: You gain three Skill Edges for which you qualify. Special: You may count Hobbyist Features as ?General Features? for the purposes of any effect that would grant you a General Feature. May Playtest Errata: These Skill Edges must Rank Up a Skill.";
		prereqs.put("Gen Edu", 3);
		prereqs.put("Perception", 3);
	}
	public Hobbyist(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",3) && t.checkSkillRank("Perception",3);
	}
}