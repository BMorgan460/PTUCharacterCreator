package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fire_Bringer extends Feature {
	{
		name = "Fire Bringer";
		tags = "[Class][+Special Attack or Attack]";
		frequency = "Static";
		effect = "Choose two of Flame Burst, Flame Wheel, Flame Charge, or Will-O-Wisp. You learn the chosen Moves";
		prereqs.put("Elemental Connection (Fire)", 0);
		prereqs.put("Combat", 3);
	}
	public Fire_Bringer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",3);
	}
}