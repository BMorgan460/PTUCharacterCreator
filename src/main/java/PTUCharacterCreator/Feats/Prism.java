package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Prism extends Feature {
	{
		name = "Prism";
		tags = "[Class] [+Special Attack]";
		frequency = "Static";
		effect = "You learn the Moves Flash and Swift.";
		prereqs.put("Elemental Connection (Normal)", 0);
		prereqs.put("Gen Edu", 3);
		prereqs.put("Charm", 3);
	}
	public Prism(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",3) && t.checkSkillRank("Charm",3);
	}
}