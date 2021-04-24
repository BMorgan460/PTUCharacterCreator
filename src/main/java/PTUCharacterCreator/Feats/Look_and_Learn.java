package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Look_and_Learn extends Feature {
	{
		name = "Look and Learn";
		tags = "";
		frequency = "x2 Uses - Extended Action";
		effect = "When you activate Look and Learn, you may gain any of the Features listed on page 86 of the Core handbook even though they are Features from other Classes. You do not need to meet their normal prerequisites, but you must meet the Prerequisites listed. Look and Learn can be used two times, once to learn a Feature from the Scene Features List, and once to learn a Feature from the Action Point Features List.";
		prereqs.put("Hobbyist", -1);
		prereqs.put("Gen Edu", 5);
		prereqs.put("Perception", 5);
	}
	public Look_and_Learn(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hobbyist") && t.checkSkillRank("Gen Edu",5) && t.checkSkillRank("Perception",5);
	}
}