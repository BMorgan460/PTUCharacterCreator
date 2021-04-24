package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Nuanced_Performance extends Feature {
	{
		name = "Nuanced Performance";
		tags = "";
		frequency = "1 AP - Free Action";
		effect = "Trigger: Your Pokemon miss all targets with a Move Effect: That Moves Frequency is not expended. This does not work with Moves that may fail to activate, such as moves with the Execute keyword.";
		prereqs.put("Coordinator", -1);
		prereqs.put("Charm, Command, Guile, Intimidate, or Intuition", 5);
	}
	public Nuanced_Performance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		String[] s = {"Charm", "Command", "Guile", "Intimidate", "Intuition"};
		return t.hasFeat("Coordinator") && checkMultipleSkills(t,s,5,1);
	}
}