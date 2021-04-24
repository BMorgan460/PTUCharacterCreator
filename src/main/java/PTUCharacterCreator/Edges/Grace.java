package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Grace extends Edge {
	{
		name = "Grace";
		effect = "Your Pokemon may consume and benefit from 2 more Poffins each. If this Pokemon is traded to a Trainer without the Grace feature, these extra dice from additional Poffins are not lost, but a Trainer without Grace may not benefit from more than 6 Dice gained from Poffins. You may always use any of the Skills that are prerequisites for Grace in the Introduction Stage of a Contest to roll for Contest Stat Dice of any kind.";
		prereqs.put("Charm, Command, Guile, Intimidate, or Intuition", 3);
	}
	public Grace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",3) || t.checkSkillRank("Command",3) || t.checkSkillRank("Guile",3) || t.checkSkillRank("Intimidate",3) || t.checkSkillRank("Intuition",3);
	}
}