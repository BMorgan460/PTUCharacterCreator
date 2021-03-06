package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fairy_Rite extends Feature {
	{
		name = "Fairy Rite";
		tags = "";
		frequency = "Daily x3 - Special";
		effect = "Trigger: Your Pokemon creates Fairy Lights as a Standard Action Effect: Your Fairy-Type Pokemon may activate Fairy Rite as a Standard Action to lose any number of Hit Points, up to a maximum equal to your Pokemons Level, and heal an adjacent Ally by that many Hit Points. Then, if your Fairy-Type Pokemon has any Fairy Lights, they may immediately expend any Fairy Lights to gain a Tick of Hit Points, or cause an ally within 6 meters to gain a Tick of Hit Points.";
		prereqs.put("Fairy Lights", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Fairy_Rite(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fairy Lights");
	}
}