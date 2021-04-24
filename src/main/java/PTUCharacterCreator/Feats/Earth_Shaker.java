package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Earth_Shaker extends Feature {
	{
		name = "Earth Shaker";
		tags = "[Class] [+Defense]";
		frequency = "Static";
		effect = "Pick two of Bulldoze, Mud Shot, or Sand-Attack. You learn the chosen Moves.";
		prereqs.put("Elemental Connection (Ground)", 0);
		prereqs.put("Intuition", 3);
		prereqs.put("Focus", 3);
	}
	public Earth_Shaker(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intuition",3) && t.checkSkillRank("Focus",3);
	}
}