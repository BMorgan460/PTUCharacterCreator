package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Trickster extends Feature {
	{
		name = "Trickster";
		tags = "[Class]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: Your Pokemon hits a foe with a Status-Class Move or a foe triggers your Pokemons Hazard Effect: After the Move is resolved, your Pokemon may perform a Dirty Trick or Manipulate Maneuver on that foe as a Free Action. The Maneuver automatically hits, but the target must be in range for the chosen Maneuver. Use your own Guile to resolve Manipulate Rolls.";
		prereqs.put("Guile", 3);
	}
	public Trickster(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Guile",3);
	}
}