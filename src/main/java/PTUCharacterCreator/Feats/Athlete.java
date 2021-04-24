package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Athlete extends Feature {
	{
		name = "Athlete";
		tags = "[Class] [+HP]";
		frequency = "At-Will - Extended Action";
		effect = "After an hour of exercise, an Athlete may choose two different Stats besides HP, both of those stats become Trained Stats. The default State of Trained Stats is +1 Combat Stages instead of 0. An Athlete may have two Trained Stats at a time.";
		prereqs.put("Athletics", 3);
		prereqs.put("One of Athletic Prowess", 0);
		prereqs.put("Mounted Prowess", -3);
		prereqs.put("Power Boost", -3);
		prereqs.put("Stamina", -3);
		prereqs.put("or Swimmer", 0);
	}
	public Athlete(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",3) && t.hasEdge("Mounted Prowess") && t.hasEdge("Power Boost") && t.hasEdge("Stamina");
	}
}