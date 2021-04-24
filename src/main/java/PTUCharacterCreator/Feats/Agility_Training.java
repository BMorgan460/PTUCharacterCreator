package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Agility_Training extends Feature {
	{
		name = "Agility Training";
		tags = "[Training][Orders]";
		frequency = "At-Will - Special";
		effect = "The target becomes Agile until the end of the effect duration. Agile Pokemon gain a +1 bonus to Movement Capabilities and +4 to Initiative.";
		prereqs.put("Athletics", 3);
		prereqs.put("Command", 2);
	}
	public Agility_Training(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",3) && t.checkSkillRank("Command",2);
	}
}