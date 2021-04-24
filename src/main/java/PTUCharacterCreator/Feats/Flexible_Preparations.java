package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Flexible_Preparations extends Feature {
	{
		name = "Flexible Preparations";
		tags = "";
		frequency = "Daily - Extended Action";
		effect = "Target: A Pokemon that has Contest Stats from Poffins Effect: The target may reallocate up to 2d6 of Poffin-Derived Contest Stats from one Contest Stat to another. This effect lasts until the end of the day.";
		prereqs.put("Adaptable Performance", -1);
		prereqs.put("Charm, Command, Guile, Intimidate, or Intuition", 4);
	}
	public Flexible_Preparations(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Charm", "Command", "Guile", "Intimidate", "Intuition"};
		return t.hasFeat("Adaptable Performance") && checkMultipleSkills(t,s,4,1);
	}
}