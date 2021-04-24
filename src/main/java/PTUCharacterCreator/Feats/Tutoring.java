package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Tutoring extends Feature {
	{
		name = "Tutoring";
		tags = "";
		frequency = "One Time Use x3 - Extended Action";
		effect = "When activating this Feature, select a Move known either by yourself or by 3 Pokemon you own. This Move is Mastered. As an Extended Action, you may have Pokemon spend 2 Tutor Points to learn a Move you have Mastered. Pokemon targeted this way can only learn Moves that they could learn by Level Up, TM, Egg Move, or Move Tutor. You may take Tutoring multiple times, each time gaining 3 uses of the Feature.";
		prereqs.put("Gen Edu", 3);
		prereqs.put("Special (See Effect)", 0);
	}
	public Tutoring(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",3);
	}
}