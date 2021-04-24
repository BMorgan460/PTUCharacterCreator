package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Signer extends Feature {
	{
		name = "Signer";
		tags = "[Patron Stat]";
		frequency = "Static";
		effect = "Choose a Rank 1 Blessing. You gain this Blessing in the form of a Sign. Signs store the energy of the Divine, and may be activated as a Swift Action. Signs can be used once per Scene, and cost 1 AP to activate. Rank 1 Blessings: Ancient Wisdom, Blessed Strike, Paragon, Spirit Mending";
		prereqs.put("Touched", -3);
		prereqs.put("GM Permission", 0);
	}
	public Signer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Touched");
	}
}