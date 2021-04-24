package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Lifelong_Learning extends Feature {
	{
		name = "Lifelong Learning";
		tags = "";
		frequency = "Static";
		effect = "Your Pokemon may have up to 4 Moves from their Move List come from TMs or Move Tutors.";
		prereqs.put("Move Tutor", -1);
		prereqs.put("one Mentor Skill at Master Rank", 0);
	}
	public Lifelong_Learning(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Charm", "Poke Edu", "Intuition", "Intimidate"};
		return t.hasFeat("Move Tutor") && checkMultipleSkills(t,s,6,1);
	}
}