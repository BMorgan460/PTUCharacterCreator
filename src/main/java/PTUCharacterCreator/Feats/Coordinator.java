package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Coordinator extends Feature {
	{
		name = "Coordinator";
		tags = "[Class]";
		frequency = "At-Will - Free Action";
		effect = "Your Pokemon may reroll a single Appeal Roll or Damage Roll. This Ability may be used only once per Contest, and once per Pokemon per Scene.";
		prereqs.put("Grace", -3);
		prereqs.put("Charm, Command, Guile, Intimidate, or Intuition", 3);
	}
	public Coordinator(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Grace") && (t.checkSkillRank("Charm",3) || t.checkSkillRank("Command",3) || t.checkSkillRank("Guile",3) || t.checkSkillRank("Intimidate",3) || t.checkSkillRank("Intuition",3));
	}
}