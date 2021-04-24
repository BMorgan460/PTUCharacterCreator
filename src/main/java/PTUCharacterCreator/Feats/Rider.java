package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Rider extends Feature {
	{
		name = "Rider";
		tags = "[Class] [+Speed]";
		frequency = "Static";
		effect = "While you are Mounted on a Pokemon under the effects of Agility Training, the bonuses from Agility Training are doubled.";
		prereqs.put("Mounted Prowess", -3);
		prereqs.put("Agility Training", -1);
		prereqs.put("Acrobatics", 3);
		prereqs.put("Athletics", 3);
	}
	public Rider(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Mounted Prowess") && t.hasFeat("Agility Training") && t.checkSkillRank("Acrobatics",3) && t.checkSkillRank("Athletics",3);
	}
}