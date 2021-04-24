package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Cheerleader extends Feature {
	{
		name = "Cheerleader";
		tags = "[Class]";
		frequency = "X AP - Free Action";
		effect = "Trigger: You use [Orders] Effect: Choose Cheered, Excited, or Motivated. All allies affected by the triggering effect gain the chosen condition.  This Feature costs 0 AP if the triggering effect affects only one ally, and costs 1 AP if it affects two or more.  See Extras - Class Mechanics for details.";
		prereqs.put("Inspired Training", -1);
		prereqs.put("Charm", 3);
	}
	public Cheerleader(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Inspired Training") && t.checkSkillRank("Charm",3);
	}
}