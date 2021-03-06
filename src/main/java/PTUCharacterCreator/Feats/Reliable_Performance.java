package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Reliable_Performance extends Feature {
	{
		name = "Reliable Performance";
		tags = "";
		frequency = "2 AP - Free Action";
		effect = "Trigger: Your Pokemon makes an Appeal Roll, Accuracy Check, or Skill Check Effect: For appeal rolls, instead of making the Appeal Roll, you gain 1 Appeal Point for each Dice you would have rolled. For Accuracy Checks, act as if you had rolled a 10. For Skill Checks, multiply 3.5 by your Pokemons Skill Rank, and use the resulting number as the result of your roll, rounded down. For all rolls, add or subtract any modifiers as normal.";
		prereqs.put("Nuanced Performance", -1);
		prereqs.put("Charm, Command, Guile, Intimidate, or Intuition", 6);
	}
	public Reliable_Performance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		String[] s = {"Charm", "Command", "Guile", "Intimidate", "Intuition"};
		return t.hasFeat("Adaptable Performance") && checkMultipleSkills(t,s,6,1);
	}
}