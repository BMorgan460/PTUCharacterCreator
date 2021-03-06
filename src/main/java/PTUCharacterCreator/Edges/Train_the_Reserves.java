package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Train_the_Reserves extends Edge {
	{
		name = "Train the Reserves";
		effect = "You may apply Experience Training to a number of Pokemon equal to twice your Command Rank, instead of equal to your Command Rank. Note: Beast Master or Groomer do not change the Skill that this Edge uses.";
		prereqs.put("Command", 3);
	}
	public Train_the_Reserves(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",3) && true;
	}
}