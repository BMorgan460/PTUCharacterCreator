package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sentry_Runes extends Feature {
	{
		name = "Sentry Runes";
		tags = "[+Attack or Special Attack]";
		frequency = "1 AP - Standard Action";
		effect = "Target: A Glyph you have put down, regardless of distance Effect: The target Glyph becomes an Unown of your Trainer Level, its Stats allocated as you wish. This Unown knows a single instance of Hidden Power, identical to your own. The Glyph can fight on its own without needing you to command it. At the end of the encounter, or after 5 minutes, the Unown returns to Unown Space forever, destroying the Glyph. You may only have one Glyph active in this way at a time, if various Alarm Glyphs are triggered to become Sentries at the same time, only one does so, the others will do so once the previous one has been destroyed if the Trigger condition is still being met.";
		prereqs.put("Ocu Edu", 5);
		prereqs.put("Explosive Runes", -1);
		prereqs.put("Hidden Power", -1);
	}
	public Sentry_Runes(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu",5) && t.hasFeat("Explosive Runes") && t.hasFeat("Hidden Power");
	}
}