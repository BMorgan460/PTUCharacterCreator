package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class ReBalancing extends Feature {
	{
		name = "Re-Balancing";
		tags = "[Pokemon Caretaking Research Field] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: A Pokemon with 2 Tutor Points Effect: The target loses 2 Tutor Points, and gains one of the following: +1 to all Base Stats, +2 to two different Base Stats, or +3 to a single Base Stat. The target then redistributes their Stat Points. A Pokemon may be targeted by Re-Balancing only once.";
		prereqs.put("Pusher", -1);
		prereqs.put("Poke Edu", 6);
	}
	public ReBalancing(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Pusher") && t.checkSkillRank("Poke Edu",6);
	}
}