package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Maelstrom extends Feature {
	{
		name = "Maelstrom";
		tags = "[Class] [+Speed]";
		frequency = "Static";
		effect = "You gain the Gilled Capability, and a +2 bonus to your Swim speed. Whenever your Water-Type Moves miss all targets, you gain a Tick of Temporary Hit Points.";
		prereqs.put("Elemental Connection (Water)", 0);
		prereqs.put("Athletics", 3);
		prereqs.put("Acrobatics", 3);
	}
	public Maelstrom(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",3) && t.checkSkillRank("Acrobatics",3);
	}
}