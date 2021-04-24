package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Major_Gift extends Feature {
	{
		name = "Major Gift";
		tags = "[Patron Stat]";
		frequency = "Static";
		effect = "You gain one of your Patrons Major Gifts, found in the Blessed and Damned splatbook. This Major Gift may be of your GMs choosing. This feat is able to be taken multiple times based on your GMs discretion.";
		prereqs.put("Touched", -3);
		prereqs.put("GM Permission", 0);
	}
	public Major_Gift(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Touched");
	}
}