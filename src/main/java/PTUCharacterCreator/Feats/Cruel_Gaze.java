package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Cruel_Gaze extends Feature {
	{
		name = "Cruel Gaze";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "You learn the Moves Glare and Headbutt.";
		prereqs.put("Roughneck", -1);
		prereqs.put("Intimidate", 5);
	}
	public Cruel_Gaze(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Roughneck") && t.checkSkillRank("Intimidate",5);
	}
}