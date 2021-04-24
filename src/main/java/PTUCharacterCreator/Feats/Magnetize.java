package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Magnetize extends Feature {
	{
		name = "Magnetize";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You gain the Magnetic Capability and may use this magnetism to stick to surfaces with significant metal content (ex: metal walls obviously, concrete with metal I-beams inside, etc). You may use your Overland to traverse any such surfaces, even if that means walking vertically up a wall or upside down on a ceiling. You may choose not to be Pushed when on such a surface.";
		prereqs.put("Storm Wizard Rank 1", -1);
		prereqs.put("Acrobatics", 4);
	}
	public Magnetize(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Storm Wizard Rank 1") && t.checkSkillRank("Acrobatics",4);
	}
}