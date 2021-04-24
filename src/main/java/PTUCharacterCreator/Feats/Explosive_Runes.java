package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Explosive_Runes extends Feature {
	{
		name = "Explosive Runes";
		tags = "[+Attack or Special Attack]";
		frequency = "1 AP - Standard Action";
		effect = "Target: A Glyph you have put down, regardless of distance Effect: You may use Hidden Power, originating the attack from the location of the targeted Glyph. Use your own Stats and Hidden Power values to calculate damage. Using this Feature causes the Glyph to become visible and glow for a minute afterwards.";
		prereqs.put("Ocu Edu", 4);
		prereqs.put("Glyph", -1);
		prereqs.put("Hidden Power", -1);
	}
	public Explosive_Runes(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu",4) && t.hasFeat("Glyph") && t.hasFeat("Hidden Power");
	}
}