package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Flight extends Feature {
	{
		name = "Flight";
		tags = "[+Speed]";
		frequency = "1 AP - Swift Action";
		effect = "You gain a Sky Speed equal to your Levitate Speed plus your Acrobatics or Perception Rank for the remainder of the round.";
		prereqs.put("One With the Winds", -1);
		prereqs.put("Acrobatics", 4);
	}
	public Flight(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("One With the Winds") && t.checkSkillRank("Acrobatics",4);
	}
}