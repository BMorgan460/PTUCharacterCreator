package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Move_Tutor extends Feature {
	{
		name = "Move Tutor";
		tags = "";
		frequency = "Daily - Extended Action";
		effect = "Target: A Pokemon with at least 2 Tutor Points. Effect: The target loses 2 Tutor Points, and learns any move from its Tutor List.";
		prereqs.put("Mentor", -1);
		prereqs.put("one Mentor Skill at Expert Rank", 0);
	}
	public Move_Tutor(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Charm", "Poke Edu", "Intuition", "Intimidate"};
		return t.hasFeat("Mentor") && checkMultipleSkills(t,s,5,1);
	}
}