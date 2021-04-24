package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Ground_Out extends Feature {
	{
		name = "Ground Out";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "Pick two of Drill Run, Magnitude, or Mud Bomb. You learn the chosen Moves";
		prereqs.put("Earth Shaker", -1);
		prereqs.put("Focus", 5);
		prereqs.put("Intuition", 5);
	}
	public Ground_Out(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Earth Shaker") && t.checkSkillRank("Focus",5) && t.checkSkillRank("Intuition",5);
	}
}