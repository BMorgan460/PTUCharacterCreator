package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Frost_Touched extends Feature {
	{
		name = "Frost Touched";
		tags = "[Class] [+Attack or Special Attack]";
		frequency = "Static";
		effect = "Choose two out of Haze, Ice Shard, Mist, and Powder Snow. You learn the Chosen Moves.";
		prereqs.put("Elemental Connection (Ice)", 0);
		prereqs.put("Athletics", 3);
		prereqs.put("Survival", 3);
	}
	public Frost_Touched(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",3) && t.checkSkillRank("Survival",3);
	}
}