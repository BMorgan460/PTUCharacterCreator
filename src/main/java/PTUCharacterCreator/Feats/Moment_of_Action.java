package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Moment_of_Action extends Feature {
	{
		name = "Moment of Action";
		tags = "[Orders]";
		frequency = "At-Will - Standard Action";
		effect = "Target: Up to two Allied Trainers Effect: Each target gains 1 Temporary Action Point. These Action Points disappear after one full Round.";
		prereqs.put("Cheer Brigade", -1);
		prereqs.put("Charm", 4);
	}
	public Moment_of_Action(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Cheer Brigade") && t.checkSkillRank("Charm",4);
	}
}