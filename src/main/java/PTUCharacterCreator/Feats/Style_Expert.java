package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Style_Expert extends Feature {
	{
		name = "Style Expert";
		tags = "[Class][Branch]";
		frequency = "Static";
		effect = "Your Pokemon gain +2d6 to your chosen Contest Stat. These dice are counted as if coming from Poffins.  Note: When you take Style Expert, choose from Beauty, Cool, Cute, Smart, or Tough. This becomes your Chosen Contest Stat. You may take Style Expert multiple times, each time choosing a different Contest Stat";
		prereqs.put("3 Pokemon with 3d6 in a specific certain Contest Stat from Poffins Or Coordinator", 0);
		prereqs.put("1 Pokemon with 3d6 in a specific certain Constat Stat from Poffins", 0);
	}
	public Style_Expert(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}