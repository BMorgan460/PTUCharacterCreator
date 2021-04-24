package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Commander extends Feature {
	{
		name = "Commander";
		tags = "[Class]";
		frequency = "Static";
		effect = "Choose one of Ravager Orders, Marksman Orders, Trickster Orders, Guardian Orders, or Precision Orders. You gain the chosen Feature, even if you do not meet its prerequisites.";
		prereqs.put("Command", 3);
	}
	public Commander(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",3);
	}
}