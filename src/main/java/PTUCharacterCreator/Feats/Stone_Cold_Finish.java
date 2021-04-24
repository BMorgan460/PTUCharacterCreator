package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Stone_Cold_Finish extends Feature {
	{
		name = "Stone Cold Finish";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "You learn the Moves Stone Edge and Head Smash";
		prereqs.put("Shards of Stone", -1);
		prereqs.put("Combat", 6);
		prereqs.put("Survival", 6);
	}
	public Stone_Cold_Finish(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Shards of Stone") && t.checkSkillRank("Combat",6) && t.checkSkillRank("Survival",6);
	}
}