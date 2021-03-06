package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Ancient_Heritage extends Feature {
	{
		name = "Ancient Heritage";
		tags = "[Paleontology Research Field] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Fossil Pokemon with at least 2 Tutor Points remaining Effect: The target loses 2 Tutor Points and learns Ancient Power. If the target has Ancient Power in its Level-Up List, Ancient Heritage costs no Tutor Points. As a static effect, whenever your Pokemon use Ancient Power, its activated effect occurs on 18+ and you may always choose whether it deals Physical or Special Damage, using the appropriate attack Stat.";
		prereqs.put("Fossil Restoration", -1);
	}
	public Ancient_Heritage(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fossil Restoration");
	}
}