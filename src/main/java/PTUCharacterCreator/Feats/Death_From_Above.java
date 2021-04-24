package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Death_From_Above extends Feature {
	{
		name = "Death From Above";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You learn the Moves Acrobatics and Bounce.";
		prereqs.put("Aerialist", -1);
		prereqs.put("Acrobatics", 5);
	}
	public Death_From_Above(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Aerialist") && t.checkSkillRank("Acrobatics",5);
	}
}