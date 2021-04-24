package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Lucky_Clover_Grand_Finale extends Feature {
	{
		name = "Lucky Clover Grand Finale";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "You learn the Moves Moonblast and Aromatic Mist.";
		prereqs.put("Passionato Harmony", -1);
		prereqs.put("Charm", 6);
		prereqs.put("Ocu Edu", 6);
	}
	public Lucky_Clover_Grand_Finale(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Passionato Harmony") && t.checkSkillRank("Charm",6) && t.checkSkillRank("Ocu Edu",6);
	}
}