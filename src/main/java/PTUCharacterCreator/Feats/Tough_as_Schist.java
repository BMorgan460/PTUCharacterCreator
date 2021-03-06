package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Tough_as_Schist extends Feature {
	{
		name = "Tough as Schist";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Rock-Type Pokemon Effect: While this Feature is Bound, allied Stealth Rock Hazards within 4 meters of your Pokemon are not used when a foe triggers them unless you want them to be. Whenever the target takes Super-Effective Damage from a Water, Grass, Ground, Fighting, or Steel Type Attack, they may consume an allied Stealth Rock Hazard within 4 meters to create temporary armor that grants them Damage Reduction equal to your Type-Linked Skill Rank for one full round.";
		prereqs.put("Gravel Before Me", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Tough_as_Schist(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Gravel Before Me");
	}
}