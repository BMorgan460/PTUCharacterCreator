package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Smooth extends Edge {
	{
		name = "Smooth";
		effect = "You gain +4 Evasion against Moves with the Social keyword, and gain a +2 Bonus on Save Checks against Rage and Infatuation.";
		prereqs.put("Charm or Focus", 5);
	}
	public Smooth(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",5) || t.checkSkillRank("Focus",5);
	}
}