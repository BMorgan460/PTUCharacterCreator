package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Slippery extends Edge {
	{
		name = "Slippery";
		effect = "You may use your Stealth Skill when defending in Opposed Grapple, Push, or Trip checks. When Grappling, if you win an Opposed Check when using Stealth, you must choose to end the Grapple (you cannot choose to gain Dominance).";
		prereqs.put("Stealth", 3);
	}
	public Slippery(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Stealth",3) && true;
	}
}