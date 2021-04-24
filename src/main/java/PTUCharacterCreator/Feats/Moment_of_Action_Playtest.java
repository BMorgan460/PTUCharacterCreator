package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Moment_of_Action_Playtest extends Feature {
	{
		name = "Moment of Action [Playtest]";
		tags = "[Orders] [9-15 Playtest]";
		frequency = "At-Will - Standard Action";
		effect = "Target: Up to two Allied Trainers  Effect: Each target gains 1 Temporary Action Point. These Action Points disappear after one full Round.";
		prereqs.put("Cheerleader [Playtest]", -1);
	}
	public Moment_of_Action_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Cheerleader [Playtest]");
	}
}