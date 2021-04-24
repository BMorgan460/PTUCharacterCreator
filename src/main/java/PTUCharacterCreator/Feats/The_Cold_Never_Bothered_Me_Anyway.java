package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class The_Cold_Never_Bothered_Me_Anyway extends Feature {
	{
		name = "The Cold Never Bothered Me Anyway";
		tags = "[+Attack or Special Attack]";
		frequency = "Static";
		effect = "You gain the Naturewalk (Tundra) Capability, are immune to being Frozen, and do not lose Hit Points from Hail.";
		prereqs.put("Frost Touched", -1);
	}
	public The_Cold_Never_Bothered_Me_Anyway(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Frost Touched");
	}
}