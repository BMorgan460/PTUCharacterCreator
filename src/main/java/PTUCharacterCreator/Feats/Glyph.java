package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Glyph extends Feature {
	{
		name = "Glyph";
		tags = "[+Attack or Special Attack]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Unown that is not part of a Prime Unown Effect: You may set the target Unown against any flat surface, and turn the Unown into a glyph. Glyphs have HP equal to your Level, and no other stats. Glyphs last until they are destroyed or intentionally de-activated, at which time the Unown returns to Unown Space, disappearing forever. You may have a number of active Glyphs equal to your Occult Education Rank. When setting a Glyph, you may have the Glyphs be either visible or invisible, as you prefer. At any time, as a Standard Action, you may Channel any Glyph you have set down. This causes the Glyphs eye to open and become visible if it was not. While you are channeling a Glyph, you are able to see through the Glyph, listen through it, and project your voice through it.";
		prereqs.put("Rune Master", -1);
	}
	public Glyph(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Rune Master");
	}
}