package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Passionato_Harmony extends Feature {
	{
		name = "Passionato Harmony";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "You learn the Moves Dazzling Gleam and Draining Kiss.";
		prereqs.put("Glamour Weaver", -1);
		prereqs.put("Charm", 5);
		prereqs.put("Ocu Edu", 5);
	}
	public Passionato_Harmony(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Glamour Weaver") && t.checkSkillRank("Charm",5) && t.checkSkillRank("Ocu Edu",5);
	}
}