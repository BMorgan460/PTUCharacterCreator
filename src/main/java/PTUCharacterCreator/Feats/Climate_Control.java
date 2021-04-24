package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Climate_Control extends Feature {
	{
		name = "Climate Control";
		tags = "[Climatology Research Field] [Branch]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: A Move or Ability creates a Weather Effect while non-standard Weather is already in effect Effect: The triggering Weather Effect does not replace the already extant Weather in effect, both exist simultaneously on the field. If a new Weather effect is placed on the field after the two that are out, both are replaced by the third, unless you activate this Feature again to replace only one.";
		prereqs.put("Climatology", -1);
	}
	public Climate_Control(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Climatology");
	}
}