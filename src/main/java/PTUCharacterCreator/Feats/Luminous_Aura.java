package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Luminous_Aura extends Feature {
	{
		name = "Luminous Aura";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "Choose Starlight or Sunglow. You gain the Chosen Ability.";
		prereqs.put("Blinding Brightness", -1);
		prereqs.put("Charm", 4);
		prereqs.put("Gen Edu", 4);
	}
	public Luminous_Aura(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Blinding Brightness") && t.checkSkillRank("Charm",4) && t.checkSkillRank("Gen Edu",4);
	}
}